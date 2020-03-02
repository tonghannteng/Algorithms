//  1122.   Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[arr1.length];
        Arrays.sort(arr1);
        for (int n : arr1) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        for (int n : arr2) {
            if (hashMap.containsKey(n)) {
                int val = hashMap.get(n);
                for (int i = 0; i < val; i++) {
                    result[count] = n;
                    count++;
                    hashMap.put(n, hashMap.get(n) -1);
                }
            }
        }
        for (int n: arr1) {
            if (hashMap.get(n) > 0) {
                result[count] = n;
                count++;
            }
        }
        return result;
    }
}