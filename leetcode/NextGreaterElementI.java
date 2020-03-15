//  496. Next Greater Element I

class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j =  i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    hashMap.put(nums2[i], nums2[j]);
                    break;
                }
            }

        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = hashMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}