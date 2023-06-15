package assignment9.Prb1;
public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (!isEmpty())
            return arr[front];
        else return -1;
}
    public void enqueue(int obj) {
        if (rear >= arr.length) {
             resize();
        }
        if (front == -1) front++;
        arr[rear] = obj;
        rear++;
    }
    // implemented dequeue method
    public int dequeue() {
        if (front == -1 || front >= arr.length - 1) {
            System.out.println("The Array is Empty");
            front = -1;
            return -1;
        }
        arr[front++] = 0;
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (front != -1)
            return rear - front;
        else return 0;
    }
    private void resize() {
        System.out.println("Resize Array");
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, front, newArr, front, rear - front);
        arr = newArr;
    }

    public void display() {
        if (front != -1) {
            for (int e : arr) {
                if (e != 0) System.out.print(e + "  ");
            }
            System.out.println();
            System.out.println("(Front value: " + arr[front] + " Rear value: " + arr[rear - 1] + " Total Size: " + size() + "]");
        }
    }

    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl();
        System.out.println(aq.size());
        aq.enqueue(7);
        aq.enqueue(8);
        aq.enqueue(2);
        aq.enqueue(1);
        aq.enqueue(3);
        aq.display();
        System.out.println(aq.size());
        aq.dequeue();
        aq.dequeue();
        aq.display();
        System.out.println("Peak:" + aq.peek());
    }
}

