package StacksQueues.Implentations;

public class ImplementQueueUsingArrays {
    static class MyQueue {
        int[] queue;
        int rear;
        int front;
        int size;
        int capacity;
        MyQueue(int capacity){
            this.capacity = capacity;
            queue = new int[capacity];
            size = 0;
            rear = -1;
            front = 0;
        }
        public void enqueue(int x) {
            if(size == capacity){
                System.out.println("queue overflow");
                return;
            }
            rear = (rear + 1)%capacity;
            queue[rear] = x;
            size++;
        }
        public int dequeue(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int ele = queue[front];
            front = (front+1)%capacity;
            size--;
            return ele;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[front];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public static void main(String[] args){
            MyQueue q = new MyQueue(5);
            q.enqueue(5);
            q.enqueue(7);
            System.out.println(q.peek());
            System.out.println(q.dequeue());
            System.out.println(q.size);
            System.out.println(q.dequeue());
            System.out.println(q.peek());
            System.out.println(q.isEmpty());
        }
    }
}
