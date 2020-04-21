//  1021. Remove Outermost Parentheses

class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        if (S.length() == 0) return "";
        char[] c = S.toCharArray();
        int count = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char cc : c) {
            if (cc == '(') {
                count++;
            } else if (cc == ')') {
                count--;
            }
            temp.append(cc);
            if (count == 0) {
                result.append(temp.substring(1, temp.length() - 1));
                temp = new StringBuilder();
            }
        }
        return result.toString();
    }

}