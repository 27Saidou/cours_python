public class Queue {
    int queue[] = new int[5];
    int rear;
    int size;
    int front;

    public void enQueue(int data) {
        queue[rear] = data;
        rear += 1;
        size += 1;
    }

    public void show() {
        System.out.println("Elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[i] + "");
        }
    }
}
