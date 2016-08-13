package knowledgebase.concurrent;

/**
 * Created by Du on 16/8/10.
 */
public class MySignal {

    protected boolean hasDataToProcess;

    public synchronized boolean isHasDataToProcess() {
        return this.hasDataToProcess;
    }

}
