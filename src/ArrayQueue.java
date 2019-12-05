import java.util.Arrays;

public class ArrayQueue implements IntQueue {
    private int[] values = new int[5];
    private int firstInQueue = -1;
    private int lastInQueue = -1;


    public void add(int i) {
        if (lastInQueue == values.length - 1) {
            values = Arrays.copyOf(values, values.length * 2);
        }
        values[++lastInQueue] = i;
    }

    public int peek() {
        if (firstInQueue == values.length) {
            firstInQueue = 0;
            return 0;
        }
        return values[++firstInQueue];
    }

    public boolean isEmpty() {
        return firstInQueue == lastInQueue;
    }
}
