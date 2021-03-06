package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.psuedocode;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;

public class ProtocolWriterForPseudoCode implements ISyntaxWriter<ASTProtocol> {

    public ProtocolWriterForPseudoCode() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTProtocol SyntaxTreeItem) {
        builder.append("public class blabla! \n");

        for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel ASTCommunicationChannel : SyntaxTreeItem.ASTCommunicationChannels){
            ASTCommunicationChannel.buildSyntax(builder,0);
        }

        builder.append("\n");

        for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : SyntaxTreeItem.environments){
            ASTEnvironment.buildSyntax(builder,0);
        }

        builder.append("End class \n");
    }
}
