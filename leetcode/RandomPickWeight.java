//  528. Random Pick with Weight

class RandomPickWeight {

    private int[] nums;
    private int total;
    private Random random;

    public Solution(int[] w) {
        this.nums = new int[w.length];
        this.random = new Random();

        int allTotal = 0;

        for (int i = 0; i < w.length; i++) {
            allTotal += w[i];
            this.nums[i] = allTotal;
        }
        this.total = allTotal;

    }

    public int pickIndex() {
        if (this.total == 0) {
            return -1;
        }
        int n = this.random.nextInt(this.total);
        for (int i = 0; i < this.nums.length; i++) {
            if (n < nums[i]) {
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */