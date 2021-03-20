public class MyCircularQueue {
    private int[] array;
    private int frontIndex;
    private int rearIndex;
    private int size;

    public MyCircularQueue(int k) {
        array = new int[k];
        frontIndex = 0;
        rearIndex = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (size == array.length) {
            return false;
        }

        array[rearIndex] = value;
        rearIndex = (rearIndex + 1) % array.length;
        size++;

        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        }

        frontIndex = (frontIndex + 1) % array.length;
        size--;
        return true;
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return array[frontIndex];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }

        int i = (rearIndex + array.length - 1) % array.length;
        return array[i];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }
}
