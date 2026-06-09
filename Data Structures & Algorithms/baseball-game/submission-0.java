class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations){
            if (op.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();

                stack.push(a);
                stack.push(a + b);
            }
            else if (op.equals("C")){
                if (!stack.isEmpty()) stack.pop();
            }
            else if (op.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int x : stack) {
            sum += x;
        }
        return  sum;
    }
}