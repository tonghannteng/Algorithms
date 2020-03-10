//  1071. greatest-common-divisor-of-strings

class GreatestCommonDivisorOfStrings {
    
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) return str1;
        if (str1.length() > str2.length()) {
            String s = str1.substring(str2.length());
            return gcdOfStrings(str2, s);
        } else if (str1.length() < str2.length()) {
            String s = str2.substring(str1.length());
            return gcdOfStrings(str1, s);
        }
        return "";
    }
}