public class circularQueue {

    int maxSize;
    int queueArray[];
    int front;
    int rear;
    int count;

    public circularQueue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }
    public boolean isQueueEmpty(){
        return count == 0;
    }
    public boolean isQueueFull(){
        return count == maxSize;
    }

    public void enQueue(int number){
        if (isQueueFull()) {
            System.out.println("Queue is full !");
        }
        else{
            queueArray[rear+1 % maxSize] = number;
            System.out.println("Enqueue : " + number);
            count++;
        }
    }

    public void deQueue(){
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty !");
        }
        else{
            System.out.println("Dequeue : " + queueArray[front]);
            front = (front + 1) % maxSize;
            count--;
        }
    }
    public void queueSize(){
        System.out.println("Queue Size is : " + count);
    }
    public void printQueue(){
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);
        }
    }
    

    public static void main(String[] args) {
        circularQueue queue = new circularQueue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.queueSize();
        
        queue.enQueue(60);

        queue.deQueue();
        queue.enQueue(60);
       

        queue.deQueue();

        queue.printQueue();

    }
}