//  532. K-diff Pairs in an Array

class KdiffPairsArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == k) {
                    IAndJ iandj = new IAndJ(nums[i], nums[j]);
                    set.add(iandj.toString());
                    break;
                }
            }
        }
        return set.size();
    }
}

class IAndJ {
    int i;
    int j;

    IAndJ(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return i + "" + j;
    }
}

