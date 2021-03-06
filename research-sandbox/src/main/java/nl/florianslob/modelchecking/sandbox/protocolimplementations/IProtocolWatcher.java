package nl.florianslob.modelchecking.sandbox.protocolimplementations;

public interface IProtocolWatcher {
    void reportVisitedState(int stateIdentifier);
    void reportVisitedTransaction(int transactionIdentifier, int fromStateIdentifier, int toStateIdentifier,
                                  String sourceEnvironmentName, String targetEnvironmentName,
                                  String sendOrReceive, String messageType);
}
