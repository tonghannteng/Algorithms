//  1523. Count Odd Numbers in an Interval Range

class CountOddNumbersIntervalRange {

    public int countOdds(int low, int high) {
        if (low % 2 == 1 && high % 2 == 1) {
            return (high - low ) / 2 + 1;
        } else {
            if ((high - low) % 2 == 0) {
                return (high - low) / 2;
            } else {
                return (high - low) /2 + 1;
            }
        }
    }
}