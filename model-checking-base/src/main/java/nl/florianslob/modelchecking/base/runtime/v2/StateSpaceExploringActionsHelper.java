package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpression;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionOperator;

import java.util.List;
import java.util.stream.Collectors;

public class StateSpaceExploringActionsHelper {
    /// Returns all actions that are possible to take a certain transition
    public static List<StateSpaceExploringAction> GetPossibleExploringActions(LtlTransition transition, List<StateSpaceExploringAction> exploringActions) {
        return exploringActions
                .stream()
                .filter(e -> isActionPossibleForTransition(e, transition))
                .collect(Collectors.toList());
    }

    // MOVE to static helpers!
    private static boolean isActionPossibleForTransition(StateSpaceExploringAction exploringAction, LtlTransition transition) {
        return evaluateExpressionForExploringAction(exploringAction, transition.Expression);
    }

    private static boolean evaluateExpressionForExploringAction(StateSpaceExploringAction exploringAction, LtlTransitionExpression expression) {
        if (expression.Operator == LtlTransitionExpressionOperator.TRUE) {
            return true;
        } else if (expression.Operator == LtlTransitionExpressionOperator.FALSE) {
            return false;
        } else if (expression.Operator == LtlTransitionExpressionOperator.OR) {
            return evaluateExpressionForExploringAction(exploringAction, expression.Left)
                    ||
                    evaluateExpressionForExploringAction(exploringAction, expression.Right);
        } else if (expression.Operator == LtlTransitionExpressionOperator.AND) {
            return evaluateExpressionForExploringAction(exploringAction, expression.Left)
                    &&
                    evaluateExpressionForExploringAction(exploringAction, expression.Right);
        } else if (expression.Operator == LtlTransitionExpressionOperator.NOT) {
            return !evaluateExpressionForExploringAction(exploringAction, expression.Left);
        } else if (expression.Operator == LtlTransitionExpressionOperator.ATOM) {
            if (
                    expression.AtomicProposition.Direction == exploringAction.direction
                            &&
                            // TODO Are we sure we want to ignore casing here?
                            expression.AtomicProposition.MessageType.equalsIgnoreCase(exploringAction.messageClass.getTypeName())
                            &&
                            expression.AtomicProposition.Receiver.equalsIgnoreCase(exploringAction.receiver)
            ) {
                return true;
            } else {
                return false;
            }
        } else { // We should never reach this edge case, but just to be sure...
            return false;
        }
    }
}
