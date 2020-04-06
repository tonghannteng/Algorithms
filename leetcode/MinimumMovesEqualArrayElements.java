//  453. Minimum Moves to Equal Array Elements

class MinimumMovesEqualArrayElements {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
        }
        int sum = 0;
        for (int n : nums) {
            sum += n - min;
        }
        return sum;
    }
}