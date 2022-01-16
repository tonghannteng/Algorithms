//  2042. Check if Numbers Are Ascending in a Sentence

class CheckNumbersAreAscendingSentence {
    
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MIN_VALUE;
        for (String a: arr) {
            if (isNumeric(a) && Integer.parseInt(a) <= min) {
                return false;
            } else if (isNumeric(a)) {
                min = Integer.parseInt(a);
            }
        }
        return true;
    }

    private boolean isNumeric(String num) {
        if (num == null) return false;
        try {
            int i = Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}