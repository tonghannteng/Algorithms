//  59. Check if two arrays are equal or not

import java.util.Arrays;

class CheckIfTwoArraysEqual {

    public int twoArrEqual(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length !=  arr2.length) return 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return 0;
            }
        }
        return 1;
    }
}