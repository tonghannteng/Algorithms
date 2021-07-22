//  20. Valid Parentheses

class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() < 1) return false;
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                char value = map.get(current);
                if (stack.isEmpty() || stack.peek() != value) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

