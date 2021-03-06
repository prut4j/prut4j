package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure;

public class ProtocolTransition {
    public final ProtocolStateNode targetState;
    public final ProtocolMessageActionType action;
    public final String fromRole;
    public final String toRole;
    public final String messageContentType;

    public ProtocolTransition(ProtocolStateNode targetState, ProtocolMessageActionType action, String fromRole, String toRole, String messageContentType){
        this.targetState = targetState;
        this.action = action;
        this.fromRole = fromRole; // TODO Do we really need this?
        this.toRole = toRole;
        this.messageContentType = messageContentType;
    }
}
