//  20. Search for a Range in a sorted array
/*
 * @type of arr: integer array
 * @type of target: integer
 * @return type: integer array
 */
class SearchRangeInSortedArray {
    public int[] searchRange(int[] arr, int target) {
        // write your awesome code here
        int[] result = new int[2];
        int count = 0;
        int index = -1;
        Arrays.fill(result, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                index = i;
            }
        }
        if (index == -1) {
            return result;
        } else {
            if (count == 1) {
                result[0] = index;
            } else {
                result[0] = index - count + 1;
            }
            result[1] = index;
        }
        return result;
    }
}