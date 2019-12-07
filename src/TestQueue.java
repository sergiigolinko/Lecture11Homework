public class TestQueue {
    public static void main(String args[]) {
        IntQueue queueArray = new ArrayQueue();
        queueArray.add(6);
        queueArray.add(2);
        queueArray.add(3);
        queueArray.add(3);
        queueArray.add(3);
        queueArray.add(3);
        queueArray.add(3);
        System.out.println(queueArray.peek());
        System.out.println(queueArray.remove());
        System.out.println((queueArray.size()));
        System.out.println(queueArray.isEmpty());
        IntQueue queueLink = new LinkedQueue();
        queueLink.add(5);
        queueLink.add(1);
        queueArray.add(4);
        System.out.println(queueLink.size());
        System.out.println(queueLink.peek());
        System.out.println(queueLink.remove());
        System.out.println(queueArray.isEmpty());
    }
}
