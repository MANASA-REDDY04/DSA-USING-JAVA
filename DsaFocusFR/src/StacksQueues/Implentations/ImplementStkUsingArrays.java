package StacksQueues.Implentations;

public class ImplementStkUsingArrays {
    public static class MyStack{
        int[] stk;
        int top;
        int capacity;
        MyStack(int size){
            stk = new int[size];
            capacity = size;
            top = -1;
        }
        public void push(int x){
            if(top == capacity-1){
                System.out.println("Stack Overflow");
                return;
            }
            stk[++top] = x;
        }
        public int pop(){
            if(top == -1){
                System.out.println("Stack Empty");
                return -1;
            }
            return stk[top--];
        }
        public int peek(){
            if(top == -1){
                System.out.println("Stack Empty");
                return -1;
            }
            return stk[top];
        }
        public boolean isEmpty() { return top == -1; }
        public int getSize(){return top+1;}

    }
    public static void main(String[] args) {
        MyStack stk = new MyStack(5);
        stk.push(5);
        stk.push(11);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk.isEmpty());
        System.out.println(stk.getSize());
        System.out.println(stk.peek());
    }
}
