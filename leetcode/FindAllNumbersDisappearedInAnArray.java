//  448. find all numbers disappeared in an array

class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] arr = new int[nums.length + 1];
        for (int n : nums) {
            arr[n]++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}