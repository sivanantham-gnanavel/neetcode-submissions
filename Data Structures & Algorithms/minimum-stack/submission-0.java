class MinStack {

    class Info {
        public Integer val;
        public Integer min;

        Info(Integer v, Integer m) {
            this.val = v;
            this.min = m;
        }
    }

    Stack<Info> stack;

    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int val) {
        int min = stack.isEmpty() ? val : Math.min(stack.peek().min, val);
        stack.push(new Info(val, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
