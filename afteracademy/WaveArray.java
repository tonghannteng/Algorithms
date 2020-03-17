//  9. Wave Array

class WaveArray {
    public int[] waveArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -1; i += 2) {
            if (arr[i] < arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
}