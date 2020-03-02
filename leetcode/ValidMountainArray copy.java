//  1287. element-appearing-more-than-25-in-sorted-array

class ElementAppearingMoreThan {
    public int findSpecialInteger(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count = 1;
                continue;
            }
            count++;
            if (count > arr.length/4) {
                return arr[i];
            }
        }
        return arr[0];
    }
}