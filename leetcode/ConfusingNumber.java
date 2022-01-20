//  1056. Confusing Number

class ConfusingNumber {

    public boolean confusingNumber(int n) {
        String num = String.valueOf(n);
        StringBuilder newNum = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1' || num.charAt(i) == '0' || num.charAt(i) == '8') {
                newNum.append(num.charAt(i));
            } else if (num.charAt(i) == '6') {
                newNum.append("9");
            } else if (num.charAt(i) == '9') {
                newNum.append("6");
            } else {
                return false;
            }
        }
        return !num.equals(newNum.reverse().toString());
    }
}