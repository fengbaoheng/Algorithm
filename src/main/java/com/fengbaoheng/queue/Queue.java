package com.fengbaoheng.queue;

/**
 * 队列接口
 */
public interface Queue {
    /**
     * 入队
     */
    void offer(int num);

    /**
     * @return 查看队头元素
     */
    int peek();

    /**
     * 出队
     *
     * @return 队头元素
     */
    int poll();

    /**
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * @return 元素个数
     */
    int size();
}
