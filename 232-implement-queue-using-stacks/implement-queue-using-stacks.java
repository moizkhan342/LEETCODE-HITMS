import java.util.Stack;

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from the front of queue and returns it
    public int pop() {
        peek(); // Ensure outStack has the current front
        return outStack.pop();
    }

    // Get the front element
    public int peek() {
        if (outStack.isEmpty()) {
            // Move all elements from inStack to outStack
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
