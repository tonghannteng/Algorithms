//  169. Majority Element

class MajorityElement {

    public int majorityElement(int[] nums) {
        int l = nums.length / 2;
        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > max && map.get(num) >= l) {
                max = map.get(num);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == max) {
                return e.getKey();
            }
        }
        return 0;
    }
}