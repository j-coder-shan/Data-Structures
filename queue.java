public class queue {

    int maxSize;
    int queueArray[];
    int front;
    int rear;
    int count;

    public queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }
    public boolean isQueueEmpty(){
        return front > rear;
    }
    public boolean isQueueFull(){
        return rear == maxSize - 1;
    }

    public void enQueue(int number){
        if (isQueueFull()) {
            System.out.println("Queue is full !");
        }
        else{
            queueArray[++rear] = number;
            System.out.println("Enqueue : " + number);
            count++;
        }
    }

    public void deQueue(){
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty !");
        }
        else{
            System.out.println("Dequeue : " + queueArray[front++]);
            count--;
        }
    }
    public void queueSize(){
        System.out.println("Queue Size is : " + count);
    }
    public void printQueue(){
        if (isQueueEmpty()) {
            System.out.println("\nQueue is Empty !");
        }
        else{
            System.out.println("\nQueue Array :");
            for (int i = front; i < maxSize; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        queue queue = new queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.queueSize();
        
        queue.enQueue(60);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.queueSize();

        queue.deQueue();

    }
}