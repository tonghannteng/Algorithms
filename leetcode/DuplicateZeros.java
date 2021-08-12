//  1089. Duplicate Zeros

class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                modifyArray(arr, i+1);
                i++;
            }
        }
    }

    private void modifyArray(int[] arr, int index) {
        int current = arr[index];
        arr[index] = 0;
        for (int i = index + 1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = current;
            current = temp;
        }

    }
}