//  22. Generate Parentheses

class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    private void generate(List<String> result, String s, int left, int right, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }
        if (left < n) {
            generate(result, s+"(", left + 1, right, n);
        }
        if (right < left) {
            generate(result, s+")", left, right + 1, n);
        }
    }
}