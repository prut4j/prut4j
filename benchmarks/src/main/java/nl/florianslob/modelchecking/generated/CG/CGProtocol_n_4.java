/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CGProtocol_n_4 implements Pr {
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_3_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment masterEnvironment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "master";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_21(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 2 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(14);
							worker_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(4);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(6);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(7);
							worker_1_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_3_";
						}
						if (receiver.equals("worker_3_")) {
							setState(9);
							worker_3_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						setState(10);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(11);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 11:
					if(!box.isPresent() && !isCloseAction){
						setState(12);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 12:
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(14);
							worker_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						setState(15);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(16);
							worker_1_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						setState(17);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(18);
							worker_2_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if(!box.isPresent() && !isCloseAction){
						setState(19);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_3_";
						}
						if (receiver.equals("worker_3_")) {
							setState(20);
							worker_3_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 21){
				Optional result = exchange_0_21(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_0_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_0_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(1);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_1_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_1_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(4);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(2);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_2_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_2_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(3);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(2);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_3_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_3_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(4);
							//queueFrommasterToworker_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(3);
							//queueFrommasterToworker_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return masterEnvironment;
			case "worker_0_": return worker_0_Environment;
			case "worker_1_": return worker_1_Environment;
			case "worker_2_": return worker_2_Environment;
			case "worker_3_": return worker_3_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "master","worker_1_","worker_2_","worker_0_","worker_3_" };
	}
	
	@Override
	public String getState(){
		return "/" + masterEnvironment.getState() + "/" + worker_0_Environment.getState() + "/" + worker_1_Environment.getState() + "/" + worker_2_Environment.getState() + "/" + worker_3_Environment.getState() + "/";
	}
	
	@Override
	public <Any> void send(String threadName, Any m, String receiver) throws Exception{
		getEnvironment(threadName).send(m,receiver);
	}
	
	@Override
	public <Any> void send(String threadName, Any m) throws Exception{
		getEnvironment(threadName).send(m);
	}
	
	@Override
	public <Any> Any recv(String threadName) throws Exception{
		return getEnvironment(threadName).receive();
	}
	
	@Override
	public void close(String threadName) throws Exception{
		getEnvironment(threadName).close();
	}
}
