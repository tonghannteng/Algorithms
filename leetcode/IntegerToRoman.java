//  12. Integer To Roman

class IntegerToRoman {

    public String intToRoman(int num) {
        String[] one_digit = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] two_digit = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] three_digit = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] four_digit = {"M", "MM", "MMM"};
        String result = "";
        int count = 0;
        for (int i = String.valueOf(num).length(); i > 0; i--) {
            char c = String.valueOf(num).charAt(count);
            if (i == 1 && c != '0') {
                result += one_digit[Integer.parseInt(c + "") - 1];
            } else if (i == 2 && c != '0') {
                result += two_digit[Integer.parseInt(c + "") - 1];
            } else if (i == 3 && c != '0') {
                result += three_digit[Integer.parseInt(c + "") - 1];
            } else if (i == 4 && c != '0') {
                result += four_digit[Integer.parseInt(c + "") - 1];
            }
            count++;
        }
        return result;
    }
}