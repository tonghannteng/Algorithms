//  1313. Decompress Run-Length Encoded List

class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int range = 0;
        for (int i = 0; i < nums.length; i+=2) {
            range+=nums[i];
        }
        int[] result = new int[range];
        int index = 0;
        for(int i = 0; i < nums.length; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                result[index] = nums[i+1];
                index++;
            }
        }
        return result;
    }
}