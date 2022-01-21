//  1119. Remove Vowels from a String

class RemoveVowelsFromString {

    public String removeVowels(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' &&
                    s.charAt(i) != 'e' &&
                    s.charAt(i) != 'i' &&
                    s.charAt(i) != 'o' &&
                    s.charAt(i) != 'u') {
                result+=s.charAt(i);
            }
        }
        return result;
    }
}