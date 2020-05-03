//  744. Find Smallest Letter Greater Than Target

class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int t = target - '0';
        for (char letter : letters) {
            int c = letter - '0';
            if (c > t) {
                return letter;
            }
        }
        return letters[0];
    }
}