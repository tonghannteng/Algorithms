//  1417. Reformat The String

class ReformatTheString {
    public String reformat(String s) {
        StringBuilder number = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                str.append(s.charAt(i));
            } else {
                number.append(s.charAt(i));
            }
        }
        if (number.length() == 0 && str.length() == 1) {
            return str.toString();
        } else if (number.length() == 1 && str.length() == 0) {
            return number.toString();
        } else if (number.length() == 0 && str.length() > 1) {
            return "";
        } else if (number.length() > 1 && str.length() == 0) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            int i = 0;
            while (i < number.length() || i < str.length()) {
                if (str.length() > number.length()) {
                    result.append(str.charAt(i));
                    if (i < number.length()) {
                        result.append(number.charAt(i));
                    }
                } else {
                    result.append(number.charAt(i));
                    if (i < str.length()) {
                        result.append(str.charAt(i));
                    }
                }
                i++;
            }
            return result.toString();
        }
    }
}