package nl.florianslob.modelchecking.sandbox.modelchecking.datastructure;

import nl.florianslob.modelchecking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class AtomicProposition {

    public final String content;

    public AtomicProposition(String content) {
        this.content = content;
    }

    public void Print() {
        LoggingHelper.logInfo(" " + content);
    }

    public String getDisplayValue() {
        return content;
    }
}
