//  1945. Sum of Digits of String After Convert

class SumDigitsStringAfterConvert {

    public int getLucky(String s, int k) {
        int result = 0;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            number.append(s.charAt(i) - 96);
        }
        while(k > 0) {
            result = 0;
            for (int i = 0; i < number.length(); i++) {
                result+=((number.charAt(i) - 48));
            }
            number = new StringBuilder(result+"");
            k--;

        }
        return result;
    }
}