//  1260. Shift 2D Grid

class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length * grid[0].length];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[index] = grid[i][j];
                index++;
            }
        }
        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        int c = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                l.add(arr[c]);
                c++;
            }
            result.add(l);
        }
        return result;
    }
}