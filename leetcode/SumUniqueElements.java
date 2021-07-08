//  1748. Sum of Unique Elements

class SumUniqueElements {

    public int sumOfUnique(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            if (m.getValue() == 1) {
                sum+=m.getKey();
            }
        }
        return sum;
    }
}