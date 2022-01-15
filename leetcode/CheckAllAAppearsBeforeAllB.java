//  2124. Check if All A's Appears Before All B's

class CheckAllAAppearsBeforeAllB {
    public boolean checkString(String s) {
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                indexA = i + 1;
            }
            if (s.charAt(i) == 'b' && indexB == 0) {
                indexB = i + 1;
            }
        }
        if (indexB == 0) return true;
        else return indexA <= indexB;
    }
}