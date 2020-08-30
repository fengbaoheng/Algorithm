package com.fengbaoheng.heap;

public abstract class AbstractHeap implements Heap {
    protected final int[] arr;
    protected int size = 0;

    public AbstractHeap(int maxSize) {
        this.arr = new int[maxSize + 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int num) {
        // 添加到堆底部
        arr[++size] = num;

        // 使堆重新有序
        swim(size);
    }

    @Override
    public int pop() {
        // 取得堆顶
        int top = arr[1];

        // 将堆底元素移动到堆顶并使堆重新有序
        swap(1, size--);
        sink(1);

        return top;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[1];
    }

    /**
     * 索引为k的节点下沉
     * 如果父节点比子节点小,两个子节点中较大的子节点与父节点交换
     */
    protected void sink(int k) {
        int cur = k;
        int maxChild = 2 * cur;

        while (maxChild <= size) {
            // 左子节点和右子节点比较寻找最大的节点,但要考虑右子节点的存在性
            if (maxChild + 1 <= size && isLess(maxChild, maxChild + 1)) {
                maxChild = maxChild + 1;
            }

            if (!isLess(cur, maxChild)) {
                break;
            }

            swap(cur, maxChild);
            cur = maxChild;
            maxChild *= 2;
        }
    }

    /**
     * 索引为k的节点上浮
     * 如果子节点比父节点大,就交换
     */
    protected void swim(int k) {
        int cur = k;
        int parent = k / 2;

        // 父节点在根节点或父节点小于子节点时
        while (parent >= 1 && isLess(parent, cur)) {
            swap(parent, cur);
            cur = parent;
            parent /= 2;
        }
    }

    protected abstract int compareTo(int a, int b);

    protected boolean isLess(int i, int j) {
        return compareTo(arr[i], arr[j]) <= 0;
    }

    protected void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
