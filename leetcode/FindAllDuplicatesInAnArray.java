//  442. find-all-duplicates-in-an-array

class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int arr[] = new int[nums.length + 1];
        for (int n : nums) {
            arr[n]++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                result.add(i);
            }
        }
        return result;
    }
}