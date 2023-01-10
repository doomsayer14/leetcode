package main;

import queue.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        System.out.println(myQueue.peek());

        myQueue.pop();
        myQueue.pop();

        System.out.println(myQueue.peek());
    }
}
