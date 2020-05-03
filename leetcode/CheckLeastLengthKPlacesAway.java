//  1437. Check If All 1's Are at Least Length K Places Away

class CheckLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index.add(i);
            }
        }
        for (int i = index.size() - 1; i >= 1; i--) {
            if (index.get(i) - index.get(i - 1) <= k) {
                return false;
            }
        }
        return true;
    }
}