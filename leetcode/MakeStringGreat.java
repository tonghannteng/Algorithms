//  1544. Make The String Great

class MakeStringGreat {

    public String makeGood(String s) {
        if (s.length() == 0) return "";
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - current) == 32) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}