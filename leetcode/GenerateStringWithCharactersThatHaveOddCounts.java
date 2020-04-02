//  1374. Generate a String With Characters That Have Odd Counts

class GenerateStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        String result = "";
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                result += "a";
            }
            result = result + "b";
        } else {
            for (int i = 0; i < n; i++) {
                result += "a";
            }
        }
        return result;
    }
}