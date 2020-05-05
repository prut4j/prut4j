package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

import java.util.Optional;
import java.util.concurrent.*;

public class StateSpaceExploringThread {
    private String threadName;
    private IProtocol protocol;
    private IEnvironment environment;

    public  StateSpaceExploringThread(String participantName){
        this.threadName = participantName;
        // Start thread that is waiting for input...
    }

    public void SetProtocolClone(IProtocol protocolClone) throws Exception {
        // Pass new environment to thread.
        this.protocol = protocolClone;
        this.environment = this.protocol.getEnvironment(this.threadName);
    }

    // Will return the protocol after a successful action, is empty otherwise.
    public Optional<IProtocol> ExecuteAction(StateSpaceExploringAction actionToBeExecuted) throws Exception {

        return testWithTimeout(actionToBeExecuted);

//
//        if(actionToBeExecuted.actionType == ParticipantActionType.SEND){
//            this.environment.send(actionToBeExecuted.dummy);
//            return Optional.of(this.protocol);
//        }
//
//        if(actionToBeExecuted.actionType == ParticipantActionType.RECEIVE){
//            var result = this.environment.receive();
//            if(result.getClass() == actionToBeExecuted.messageClass){
//                return Optional.of(this.protocol);
//            }
//        }
//
//        // Pass new action to thread.
//        // Observe result
//        // Return IProtocol (Already deep clone here?)
//        return Optional.empty();
    }

    public Optional<IProtocol> testWithTimeout(StateSpaceExploringAction actionToBeExecuted) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4); // TODO Do we want to set this?

        var self = this;
        Future<Optional<IProtocol>> future = executor.submit(new Callable<Optional<IProtocol>>() {
            @Override
            public Optional<IProtocol> call() throws Exception {
                if(actionToBeExecuted.actionType == ParticipantActionType.SEND){
                    self.environment.send(actionToBeExecuted.dummy);
                    return Optional.of(self.protocol);
                }

                if(actionToBeExecuted.actionType == ParticipantActionType.RECEIVE){
                    var result = self.environment.receive();
                    if(result.getClass() == actionToBeExecuted.messageClass){
                        return Optional.of(self.protocol);
                    }
                }

                return Optional.empty();
            }
        });

        executor.shutdown();            //        <-- reject all further submissions

        try {
            future.get(2, TimeUnit.SECONDS);  //     <-- wait 8 seconds to finish
        } catch (InterruptedException e) {    //     <-- possible error cases
            System.out.println("job was interrupted");
        } catch (ExecutionException e) {
            System.out.println("caught exception: " + e.getCause());
        } catch (TimeoutException e) {
            future.cancel(true);              //     <-- interrupt the job
            System.out.println("timeout");

            // Nothing has happened before timeout, transaction is nog possible
            return Optional.empty();
        }


        // did we get here? wow!

        // wait all unfinished tasks for 2 sec
        if(!executor.awaitTermination(2, TimeUnit.SECONDS)){
            // force them to quit by interrupting
            executor.shutdownNow();
        }

        return future.get();

    }
}
