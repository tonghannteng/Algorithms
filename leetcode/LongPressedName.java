//  925. Long Pressed Name

class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }
        if (name.length() > typed.length()) {
            return false;
        }
        if (name.charAt(0) != typed.charAt(0)) return false;
        int j = 0;
        for (int i = 0; i < typed.length(); i++) {
            if (j < name.length() && name.charAt(j) == typed.charAt(i)) {
                j++;
            } else if (j < name.length() && name.charAt(j) != typed.charAt(i)) {
                if (typed.charAt(i) != typed.charAt(i - 1)) {
                    return false;
                }
            } else if (j >= name.length() && typed.charAt(i) != typed.charAt(i-1)) {
                return false;
            }
        }
        return j == name.length();
    }
}