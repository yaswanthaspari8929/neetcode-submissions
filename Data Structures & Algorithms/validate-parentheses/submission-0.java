class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> ctoopen = new HashMap<>();
        ctoopen.put(')','(');
        ctoopen.put(']','[');
        ctoopen.put('}','{');
        for (char c:s.toCharArray()){
            if(ctoopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == ctoopen.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
