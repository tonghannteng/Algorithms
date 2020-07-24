//  1460. Make Two Arrays Equal by Reversing Sub-arrays

class MakeTwoArraysEqual {

    public boolean canBeEqual(int[] target, int[] arr) {
        int[] num = new int[1001];
        for (int i : target) {
            num[i]++;
        }
        for (int i : arr) {
            num[i]--;
        }
        for (int i : num) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}