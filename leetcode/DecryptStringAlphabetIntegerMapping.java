//  1309. Decrypt String from Alphabet to Integer Mapping

class DecryptStringAlphabetIntegerMapping {

    public String freqAlphabets(String s) {
        if (s.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        String alphabet = "*abcdefghijklmnopqrstuvwxyz";
        char[] arrChar = alphabet.toCharArray();
        int index;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                String ss = s.charAt(i - 2) + "" + s.charAt(i - 1);
                index = Integer.parseInt(ss);
                i -= 2;
            } else {
                index = Integer.parseInt(s.charAt(i) + "");

            }
            result.append(arrChar[index]);
        }
        return result.reverse().toString();
    }
}