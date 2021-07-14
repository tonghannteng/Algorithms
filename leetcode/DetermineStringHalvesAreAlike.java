//  1704. Determine if String Halves Are Alike

class DetermineStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int count = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        String vowel = "aeiou";
        for (int i = 0; i < s.length()/2; i++) {
            if (vowel.contains(s.charAt(i)+"")) {
                count++;
            }
            if (vowel.contains(s.charAt(j)+"")) {
                count--;
            }
            j--;
        }
        return count == 0;
    }
}