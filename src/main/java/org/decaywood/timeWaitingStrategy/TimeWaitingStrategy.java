package org.decaywood.timeWaitingStrategy;

/**
 * @author: decaywood
 * @date: 2015/11/24 16:16
 */
public interface TimeWaitingStrategy {

    void waiting(int loopTime);

    int retryTimes();

}
