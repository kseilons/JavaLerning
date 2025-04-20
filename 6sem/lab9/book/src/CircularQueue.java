public class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) throw new IllegalStateException("Queue is full");
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == queue.length; }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue()); // 1
        q.enqueue(3);
        System.out.println(q.dequeue()); // 2
    }
}