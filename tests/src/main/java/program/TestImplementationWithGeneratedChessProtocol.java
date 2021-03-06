package program;


import discourje.examples.chess.Move;
import nl.florianslob.modelchecking.base.api.v2.Pr;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipantAction;
import nl.florianslob.modelchecking.generated.ChessProtocol;

public class TestImplementationWithGeneratedChessProtocol {
    public static void Run() {

        Pr protocol = new ChessProtocol();

        GenericParticipant playerWhite = getGenericParticipantPlayerWhite();
        GenericParticipant playerBlack = getGenericParticipantPlayerBlack();

        Thread threadWhite, threadBlack = null;

        threadWhite = new Thread(() -> {
            try {
                playerWhite.run(protocol.getEnvironment("W"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        threadBlack = new Thread(() -> {
            try {
                playerBlack.run(protocol.getEnvironment("B"));
                // Danger! But is for debugging purposes! Black thread stops first.
                //noinspection deprecation
                threadWhite.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        threadWhite.start();
        threadBlack.start();
    }

    private static GenericParticipant getGenericParticipantPlayerBlack() {
        GenericParticipantAction sendActionBlack = GenericParticipantAction.GetSendAction(new Move());
        GenericParticipant playerBlack = new GenericParticipant();
        playerBlack.AddStartupAction(GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterSendAction(sendActionBlack, GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterReceiveActions(Move.class, sendActionBlack);
        return playerBlack;
    }

    private static GenericParticipant getGenericParticipantPlayerWhite() {
        GenericParticipantAction sendActionWhite = GenericParticipantAction.GetSendAction(new Move());
        GenericParticipant playerWhite = new GenericParticipant();
        playerWhite.AddStartupAction(sendActionWhite);
        playerWhite.AddAfterSendAction(sendActionWhite, GenericParticipantAction.GetReceiveAction());
        playerWhite.AddAfterReceiveActions(Move.class, sendActionWhite);
        return playerWhite;
    }
}
