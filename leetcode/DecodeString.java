//  394. Decode String

class DecodeString {

    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> res = new Stack<>();
        String result = "";
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                num.push(count);
            } else if (s.charAt(index) == '[') {
                res.push(result);
                result = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(res.pop());
                int c = num.pop();
                for (int i = 0; i < c; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            } else {
                result+=s.charAt(index);
                index++;
            }
        }
        return result;
    }
}