package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v5.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.psuedocode.ProtocolWriterForPseudoCode;

public class SyntaxWriterProvider {


    public SyntaxWriterProvider(String targetLanguage, boolean useLocalTypes) throws UnsupportedOperationException {
        // TODO Replace with some for of Dependency Injection
        // Autofac alternative for Java = ???

        if(targetLanguage.equals("Java11")){
            if(useLocalTypes) {
                ProtocolWriter = new ProtocolWriterForJava11();
                ChannelWriter = new ChannelWriterForJava11();
                EnvironmentWriter = new EnvironmentWriterForJava11();
                CaseStatementWriter = new CaseStatementWriterForJava11();
                WaitActionWriter = new WaitActionWriterForJava11();
                SendActionWriter = new SendActionWriterForJava11();
                CloseActionWriter = new CloseActionWriterForJava11();
                ReceiveActionWriter = new ReceiveActionWriterForJava11();
            }else{
                ProtocolWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.ProtocolWriterForJava11();
                ChannelWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.ChannelWriterForJava11();
                EnvironmentWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.EnvironmentWriterForJava11();
                CaseStatementWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.CaseStatementWriterForJava11();
                WaitActionWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.WaitActionWriterForJava11();
                SendActionWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.SendActionWriterForJava11();
                CloseActionWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.CloseActionWriterForJava11();
                ReceiveActionWriter = new nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.ReceiveActionWriterForJava11();
            }
            // init fields
        }
        else if (targetLanguage.equals("PseudoCode")){
            ProtocolWriter = new ProtocolWriterForPseudoCode();
            // TODO NEEDS IMPLEMENTATION:
            EnvironmentWriter = null;
            CaseStatementWriter = null;
            WaitActionWriter = null;
            SendActionWriter = null;
            CloseActionWriter = null;
            ReceiveActionWriter = null;
        }
    }

    public ISyntaxWriter<ASTProtocol> ProtocolWriter = null;
    public ISyntaxWriter<ASTCommunicationChannel> ChannelWriter = null;
    public ISyntaxWriter<ASTEnvironment> EnvironmentWriter = null;
    public ISyntaxWriter<ASTStateCaseStatement> CaseStatementWriter = null;
    public ISyntaxWriter<ASTWaitAction> WaitActionWriter = null;
    public ISyntaxWriter<ASTSendAction> SendActionWriter = null;
    public ISyntaxWriter<ASTReceiveAction> ReceiveActionWriter = null;
    public ISyntaxWriter<ASTCloseAction> CloseActionWriter = null;
}
