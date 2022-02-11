//  760. Find Anagram Mappings

class FindAnagramMappings {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int [] result = new int[nums1.length];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            hashMap.put(nums2[i], i);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = hashMap.get(nums1[i]);
        }
        return result;
    }
}