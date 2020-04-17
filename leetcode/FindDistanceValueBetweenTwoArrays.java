//  1385. Find the Distance Value Between Two Arrays

class FindDistanceValueBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            List<Boolean> list = new ArrayList<>();
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    list.add(true);
                }
            }
            if (list.size() == 0) {
                count++;
            }
        }
        return count;
    }
}