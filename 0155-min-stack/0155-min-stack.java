class MinStack {

    private int[] stack;
    private int[] minStack;   // minStack[i] = min of everything at/below level i
    private int top;

    public MinStack() {
        stack = new int[30001];
        minStack = new int[30001];
        top = -1;             // empty
    }

    public void push(int val) {
        top++;
        stack[top] = val;
        // store the smaller of val and current min
        if (top == 0) minStack[top] = val;
        else          minStack[top] = Math.min(val, minStack[top - 1]);
    }

    public void pop() {
        top--;                // drop both levels at once (shared top)
    }

    public int top() {
        return stack[top];    // real top value
    }

    public int getMin() {
        return minStack[top]; // running min — O(1)
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */