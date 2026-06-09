class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char popCh = stack.pop();
                if (!((popCh == '(' && c == ')') 
                || (popCh == '{' && c == '}') 
                || (popCh == '[' && c == ']')))
                return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
