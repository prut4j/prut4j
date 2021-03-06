package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import nl.florianslob.modelchecking.base.api.IEnvironment;
import nl.florianslob.modelchecking.base.api.IProtocol;
import nl.florianslob.modelchecking.base.api.ProtocolMessage;

public class Chess {

    public static void play(boolean visualizeProtocolGraph) {
        PlantUmlProtocolWatcher plantUmlProtocolWatcher = new PlantUmlProtocolWatcher();
        IProtocol protocol;
        if (visualizeProtocolGraph) {
            protocol = new ChessProtocolWithGraphVisualization(plantUmlProtocolWatcher);
        } else {
            protocol = new ChessProtocol();
        }

        new Thread(() -> {
            try {
                runWhite(protocol.getEnvironment("W"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();

        new Thread(() -> {
            try {
                runBlack(protocol.getEnvironment("B"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();
    }

    public static void runWhite(IEnvironment environment) throws Exception {
        Board board = new Board("White");
        while (!board.isFinal()) {
            if (board.isNotInitial()) {
                Move mBlack = (Move) environment.receive();
                board.update(mBlack);
                board.print();
                if (board.isFinal()) break;
            }

            Move mWhite = new Move();
            board.update(mWhite);
            board.print();
            environment.send(new ProtocolMessage<>("B",mWhite));
        }
    }

    public static void runBlack(IEnvironment environment) throws Exception {
        Board board = new Board("Black");
        while (!board.isFinal()) {

            Move mWhite = (Move) environment.receive();
            board.update(mWhite);
            if (board.isFinal()) break;

            board.print();
            Move mBlack = new Move();
            board.update(mBlack);
            board.print();
            environment.send(new ProtocolMessage<>("W",mWhite));
        }
    }
}
