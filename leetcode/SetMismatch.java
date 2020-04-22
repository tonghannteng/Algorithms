//  645. Set Mismatch

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int d = 0;
        int m;
        Set<Integer> set = new HashSet<>();
        int sum = (nums.length * (nums.length + 1)) / 2;
        for (int n : nums) {
            if (set.contains(n)) {
                d = n;
            }
            sum -= n;
            set.add(n);
        }
        m = sum + d;
        result[0] = d;
        result[1] = m;
        return result;
    }
}