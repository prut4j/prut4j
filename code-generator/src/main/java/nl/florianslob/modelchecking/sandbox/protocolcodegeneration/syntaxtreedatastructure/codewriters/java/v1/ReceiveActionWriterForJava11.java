package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTReceiveAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class ReceiveActionWriterForJava11 implements ISyntaxWriter<ASTReceiveAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTReceiveAction SyntaxTreeItem) {
//        && "+SyntaxTreeItem.communicationChannel.queueName+".peek().getClass() == "+SyntaxTreeItem.messageContentType+".class
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (!box.isPresent() && !"+SyntaxTreeItem.communicationChannel.queueName+".isEmpty()) {", "}", tabCount,
                (tabCountLvl0) -> {
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "monitor.notifyAll();");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "setState("+SyntaxTreeItem.nextStateId+");");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "// Disabling unchecked inspection: We did check the class in the if statement above");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "//noinspection unchecked");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.of((Any)"+SyntaxTreeItem.communicationChannel.queueName+".take());");
                }
        );
    }
}
