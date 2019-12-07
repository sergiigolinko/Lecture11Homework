import java.util.Arrays;

public class ArrayQueue implements IntQueue {
    private int[] values = new int[5];
    private int firstInQueue = -1;
    private int lastInQueue = -1;
    private int numberOfElements=0;


    public void add(int i) {
        if (lastInQueue == values.length - 1) {
            values = Arrays.copyOf(values, values.length * 2);
        }
        values[++lastInQueue] = i;
        numberOfElements++;
    }

    public int peek() {
        if (firstInQueue == values.length) {
            firstInQueue = 0;
            return 0;
        }
        return values[++firstInQueue];
    }

    public int remove(){
        int temp=values[firstInQueue++];
        if(firstInQueue==values.length){
            firstInQueue=0;
        }
        numberOfElements--;
        return temp;
    }
    public int size(){
        return numberOfElements;
    }

    public boolean isEmpty() {
        return firstInQueue == lastInQueue;
    }
}
