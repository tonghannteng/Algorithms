//  957. Prison Cells After N Days

class PrisonCellsAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int N) {
        int mod = (N-1)%14; // because if N=1 means that at day=1.
        int[] temp = new int[cells.length];

        temp[0] = 0;
        temp[temp.length-1] = 0;
        for (int i = 1; i < cells.length - 1; i++) {
            if (cells[i-1] == cells[i+1]) {
                temp[i] = 1;
            } else {
                temp[i] = 0;
            }
        }
        cells = temp;
        // till now we get Get Day1 - Prisons Cells
        //Now we solve for Day 1 On-Ward till N%14
        for (int i = 1; i <= mod; i++) {
            temp = new int[temp.length];
            for (int j = 1; j < temp.length-1; j++) {
                if (cells[j-1] == cells[j+1]) {
                    temp[j] = 1;
                } else {
                    temp[j] = 0;
                }
            }
            cells = temp;
        }
        return cells;
    }
}