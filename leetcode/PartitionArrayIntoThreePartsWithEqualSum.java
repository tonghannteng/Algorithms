//  1013. Partition Array Into Three Parts With Equal Sum

class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        int d = sum / 3;
        sum = 0;
        int count = 0;
        for (int a : A) {
            sum += a;
            if (sum == d) {
                count++;
                sum = 0;
            }
        }
        return count >= 3;
    }
}