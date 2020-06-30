package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

import java.util.ArrayList;
import java.util.List;

public class LtlState {
    public List<LtlTransition> OutgoingTransactions = new ArrayList<>();
    public int stateNumber;

    public LtlState(int stateNumber) {

        this.stateNumber = stateNumber;
    }
}