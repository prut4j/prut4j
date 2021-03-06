package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.HashSet;

public class FindUniqueCommunicationChannelsProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    private ISyntaxWriter<ASTCommunicationChannel> syntaxWriter;

    public FindUniqueCommunicationChannelsProtocolDefinitionVisitor(ISyntaxWriter<ASTCommunicationChannel> syntaxWriter){
        this.syntaxWriter = syntaxWriter;
    }

    public HashSet<ASTCommunicationChannel> ASTCommunicationChannels = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) {
        for(ProtocolTransition transaction : protocolStateNode.outgoingTransactions){
            ASTCommunicationChannel channel =
                new ASTCommunicationChannel(this.syntaxWriter, transaction.fromRole, transaction.toRole);
            if(!ASTCommunicationChannels.contains(channel)){
                ASTCommunicationChannels.add(channel);
            }
        }
    }
}
