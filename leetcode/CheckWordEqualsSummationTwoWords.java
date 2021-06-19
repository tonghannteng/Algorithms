//  1880. Check if Word Equals Summation of Two Words

class CheckWordEqualsSummationTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convertToInt(firstWord) + convertToInt(secondWord) == convertToInt(targetWord);
    }

    public int convertToInt(String num) {
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            result = result*10 + (num.charAt(i) - 'a');

        }
        return result;
    }
}