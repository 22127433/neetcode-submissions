class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> minS;
    public MinStack() {
        s = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if (!minS.isEmpty()) {
            int minVal = minS.peek();
            if (val > minVal){
                val = minVal;
            }
        }
        minS.push(val);
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        s.pop();
        minS.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
