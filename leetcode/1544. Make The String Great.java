class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0 ;i<s.length();i++){
            if(stack.size()==0 || Math.abs(stack.peek()-s.charAt(i))!=32){
                stack.add(s.charAt(i));
            }
            else stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
