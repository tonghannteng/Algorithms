//  463. Island Perimeter

class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int c = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1)              //if 1, count 0 around that element
                    c += count(grid, i, j);
            }
        }
        return c;
    }

    public int count(int[][] grid, int i, int j) {    //count 0 around grid[i][j] element
        int c = 0;
        if (i - 1 < 0 || grid[i - 1][j] == 0)               //if i is 0th row, count it, because grid is surrounded by water
            c++;
        if (i + 1 >= grid.length || grid[i + 1][j] == 0)    //same if i is last row, it is surrounded by water
            c++;
        if (j - 1 < 0 || grid[i][j - 1] == 0)              // 0th column is also surrounded by water
            c++;
        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0)  // last column is also surrounded by water
            c++;
        return c;
    }
}