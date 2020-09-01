package nl.florianslob.modelchecking.sandbox.protocolcodegeneration;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import discourje.core.graph.Florian;
import discourje.core.graph.Graph;
import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        // TODO Replace with some form of dependency injection
        var writerProvider = new SyntaxWriterProvider("Java11");

        var chessProtocolState0 = getInitialStateForChessProtocol();

        List<IProtocolDefinitionVisitor> visitorsFirstPass = new LinkedList<>();
        var plantUmlVisualizationVisitor =
            new CreatePlantUmlVisualizationProtocolDefinitionVisitor();
        var uniqueCommunicationChannelFinderVisitor =
            new FindUniqueCommunicationChannelsProtocolDefinitionVisitor(writerProvider.ChannelWriter);
        var findUniqueRoleNamesProtocolDefinitionVisitor =
            new FindUniqueRoleNamesProtocolDefinitionVisitor();

        visitorsFirstPass.add(plantUmlVisualizationVisitor);
        visitorsFirstPass.add(uniqueCommunicationChannelFinderVisitor);
        visitorsFirstPass.add(findUniqueRoleNamesProtocolDefinitionVisitor);

        chessProtocolState0.Accept(visitorsFirstPass);

        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();


        var visitorsSecondPass = new LinkedList<CreateEnvironmentForRoleProtocolDefinitionVisitor>();

        for(String roleName : findUniqueRoleNamesProtocolDefinitionVisitor.roleNames){
            visitorsSecondPass.add(new CreateEnvironmentForRoleProtocolDefinitionVisitor(roleName, writerProvider, uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels));
        }
        // pass2
        chessProtocolState0.Accept(visitorsSecondPass);

        var environments = new HashSet<ASTEnvironment>();

        for(CreateEnvironmentForRoleProtocolDefinitionVisitor visitor : visitorsSecondPass){
            environments.add(visitor.getASTStateCaseStatements());
        }

        var protocolSyntaxTree = new ASTProtocol(writerProvider.ProtocolWriter, "GeneratedChessProtocol",
            uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels, environments);

        var builder = new StringBuilder();
        protocolSyntaxTree.buildSyntax(builder,0);

        //append string buffer/builder to buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../model-checking-testproject/src/main/java/nl/florianslob/modelchecking/generated/GeneratedChessProtocol.java"))) {
            bw.append(builder);//Internally it does aSB.toString();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ProtocolStateNode getInitialStateForChessProtocol() {
//        var FlorianImpl = new  discourje.core.main.();
        IFn require = Clojure.var("clojure.core","require");
//
//        // NB: our namespace interop-blog contains a hyphen.  This is translated to
//        // an underscore in the file path.  It can be tricky to remember when to use a
//        // hyphen and when to use an underscore, so maybe a better practice is to
//        // avoid hypens in namespaces
        require.invoke(Clojure.read("discourje.core.main"));
//        var result = require.invoke(Clojure.read("discourje.core.main.test"), "C:/src/study/model-checking-sandbox/model-checking-sandbox/chess.dcj");

        IFn testFunc1  = Clojure.var("discourje.core.main", "-test");
        var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/model-checking-sandbox/protocol_definitions/chessWithPlayerNames.dcj";
        var test = testFunc1.invoke(pathToProtocolDefinition);
        IFn testFunc2  = Clojure.var("discourje.core.main", "-test2");

        // TODO Now we have the graph here
        var test2 = (Graph)testFunc2.invoke(pathToProtocolDefinition);

        // Find a way for .toJava to return the initial state node.
        // Adapter pattern? --> Move logic to this project.
        var javaSyntax = test2.toJava();

        var state0 = new ProtocolStateNode(0);
        var state1 = new ProtocolStateNode(1);
        var state2 = new ProtocolStateNode(2);
        var state3 = new ProtocolStateNode(3);
        var state4 = new ProtocolStateNode(4);
        var state5 = new ProtocolStateNode(5);
        var state6 = new ProtocolStateNode(6);

        var roleWhiteName = "W";
        var roleBlackName = "B";
        var messageTypeName = "Move";

        state0.AddOutgoingTransaction(new ProtocolTransition(state1, ProtocolMessageActionType.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state1.AddOutgoingTransaction(new ProtocolTransition(state2, ProtocolMessageActionType.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state2.AddOutgoingTransaction(new ProtocolTransition(state3, ProtocolMessageActionType.SEND,  roleBlackName, roleWhiteName, messageTypeName));
        state3.AddOutgoingTransaction(new ProtocolTransition(state4, ProtocolMessageActionType.RECEIVE, roleBlackName, roleWhiteName, messageTypeName));
        state4.AddOutgoingTransaction(new ProtocolTransition(state5, ProtocolMessageActionType.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state5.AddOutgoingTransaction(new ProtocolTransition(state6, ProtocolMessageActionType.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state6.AddOutgoingTransaction(new ProtocolTransition(state3, ProtocolMessageActionType.SEND, roleBlackName, roleWhiteName, messageTypeName));

        return state0;
    }
}
