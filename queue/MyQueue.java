package queue;

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 * <p>
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 */
public class MyQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    private int first;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack1.empty()) {
            first = x;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack1.push(x);
        while (!stack2.empty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    public int pop() {
        int res = stack1.pop();
        if (!stack1.empty()) {
            first = res;
        }
        return res;
    }

    public int peek() {
        return first;
    }

    public boolean empty() {
        return stack1.empty();
    }
}