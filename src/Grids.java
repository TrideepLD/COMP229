import java.awt.*;

public class Grids {

    int gridSizeX;
    int gridSizeY;
    int cellSize;
    private Cells[][] grid;

    // public Grids(int x, int y) {
    //     grid = new Cells[x][y];
    // }

    /**
     * So basically what happens here is that the function below is a way to give the array some value, cause otherwise the array is null.
     */
    public Grids(int gridSizeX, int gridSizeY, int cellSize) {
        grid = new Cells[gridSizeX][gridSizeY];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Cells(10 + cellSize*i, 10 + cellSize*j, cellSize);
            }
        }
    }

    public void drawGrid(Graphics g) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j].draw(g);    
            }
        }

    }


}