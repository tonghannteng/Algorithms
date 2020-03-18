//  941. first-missing-positive

class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }
}