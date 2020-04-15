//  383. Ransom Note

class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] b = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            b[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            b[ransomNote.charAt(i) - 'a']--;
        }
        for (int n : b) {
            if (n < 0) {
                return false;
            }
        }
        return true;
    }
}