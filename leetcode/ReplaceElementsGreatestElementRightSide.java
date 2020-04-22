//  1299. Replace Elements with Greatest Element on Right Side

class ReplaceElementsGreatestElementRightSide {

    public int[] replaceElements(int[] arr) {
        int max = -1;
        int num;
        for(int i = arr.length-1; i >=0; i--) {
            num = arr[i];
            arr[i] = max;
            max = Math.max(max, num);
        }
        return arr;
    }
}