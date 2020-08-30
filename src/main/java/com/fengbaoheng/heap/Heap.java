package com.fengbaoheng.heap;

/**
 * 堆接口
 */
public interface Heap {
    /**
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * @return 容量
     */
    int size();

    /**
     * 添加一个数字,并使堆仍然保持有序
     *
     * @param num 添加的数字
     */
    void add(int num);

    /**
     * 弹出堆顶元素
     *
     * @return 堆顶元素
     */
    int pop();

    /**
     * @return 堆顶元素
     */
    int peek();
}
