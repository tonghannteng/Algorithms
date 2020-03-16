//  72. Longest Increasing subsequence

class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] arr) {
        // write your awesome code here
        int[] arrFill = new int[arr.length];
        Arrays.fill(arrFill, 1);
        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arrFill[j] = Math.max(arrFill[j], arrFill[i]+1);
                }

            }
        }
        Arrays.sort(arrFill);
        return arrFill[arrFill.length-1];

    }
}