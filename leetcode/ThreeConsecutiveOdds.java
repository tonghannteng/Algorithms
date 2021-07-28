//  1550. Three Consecutive Odds

class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) return false;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
                if (count == 3) {
                    break;
                }
            } else {
                count = 0;
            }
        }
        return count >= 3;
    }
}