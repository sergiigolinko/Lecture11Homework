public class LinkedQueue implements IntQueue {
    private QueueElement lastInQueue = null;
    private QueueElement firstInQueue = null;
    private int size = 0;

    public void add(int i) {
        QueueElement currentElement = new QueueElement(i);
        if (firstInQueue == null) {
            firstInQueue = currentElement;
        } else {
            lastInQueue.setNext(currentElement);
        }
        lastInQueue = currentElement;
        size++;
    }

    public int peek() {
        return firstInQueue.getValue();
    }

    public int remove() {
        if (size == 0) {
            return 0;
        }
        int result = firstInQueue.getValue();
        firstInQueue = firstInQueue.getNext();
        if (firstInQueue == null) {
            lastInQueue = null;
        }
        size--;
        return result;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return firstInQueue == lastInQueue;
    }
}
