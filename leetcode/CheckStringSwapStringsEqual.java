//  1790. Check if One String Swap Can Make Strings Equal

class CheckStringSwapStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (subString(s1, s2)) {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                }
            }
            return count <= 2;
        } else {
            return false;
        }
    }

    public boolean subString(String s1, String s2) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}