//  1047. Remove All Adjacent Duplicates In String

class RemoveAllAdjacentDuplicatesString {

    public String removeDuplicates(String S) {
        if (S.length() == 0 || S.length() == 1) return S;
        StringBuilder bd = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            bd.append(stack.pop());
        }
        return bd.reverse().toString();
    }
}