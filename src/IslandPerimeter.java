/*
 * You are given row x col grid representing a map where 
 * grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally). 
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. 
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
 * Determine the perimeter of the island.
 */

    public class IslandPerimeter {
        public static int islandPerimeter(int[][] grid) {
            int sum = 0;
            //iterate through the row
            for (int i = 0; i < grid[0].length; i++) {
                //iterate through the columns
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == 1) {
                        //check above
                        if (j > 0) {
                            if (grid[j-1][i] == 0) {
                                sum += 1;
                            }
                        }else {
                            sum += 1;
                        }
                        //check below
                        if (j < grid.length-1) {
                            if (grid[j+1][i] == 0) {
                                sum += 1;
                            }
                        }else {
                            sum += 1;
                        }
                        //check to the left
                        if (i > 0) {
                            if (grid[j][i-1] == 0) {
                                sum += 1;
                            }
                        }else {
                            sum += 1;
                        }
                        //check to the right
                        if (i < grid[j].length-1) {
                            if (grid[j][i+1] == 0) {
                                sum += 1;
                            }
                        }else {
                            sum += 1;
                        }
                    }
                }
            }
            return sum;
        }
    public static void main(String[] args) {
        int[][] x = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        //, {1, 1, 0, 0}
        System.out.println(islandPerimeter(x));
    }
}
