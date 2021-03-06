package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.IProtocolDefinitionVisitor;

import java.util.HashSet;
import java.util.List;

public class ProtocolStateNode {
    public HashSet<ProtocolTransition> outgoingTransactions = new HashSet<>();
    public int stateId;
    public boolean VisitedBefore = false;

    public ProtocolStateNode(int stateId){
        this.stateId = stateId;
    }

    public void AddOutgoingTransaction(ProtocolTransition outgoingTransaction){
        this.outgoingTransactions.add(outgoingTransaction);
    }

    /**
     * Implementation of the Visitor Pattern with a simple cycle detection to prevent infinite execution.
     */
    public void Accept(List<? extends IProtocolDefinitionVisitor> visitors) throws Exception {
        // Stop execution if visited before
        if(VisitedBefore) {
            // Resetting to enable multiple passes.
            VisitedBefore = false;
            return;
        }

        // Prevent second visits
        VisitedBefore = true;

        // Do visit action for all visitors
        for(IProtocolDefinitionVisitor visitor : visitors){
            visitor.Visit(this);
        }

        // Recursively visit the whole tree
        for(ProtocolTransition transaction : outgoingTransactions){
            if(!transaction.targetState.VisitedBefore)
                transaction.targetState.Accept(visitors);
        }

        // Resetting to enable multiple passes. --> No this could be a problem!
//        visitedBefore = false;
    }
}
