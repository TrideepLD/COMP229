import java.awt.*;

public class Grids {

    int xAxis;
    int yAxis;
    int size = 35;

    Cells[][] grid = new Cells [xAxis][yAxis];

    public Grids(int x, int y) {
        grid = new Cells[x][y];
    }

    public Grids(int size) {
        grid = new Cells[size][size];
    }

    public void drawGrid(Graphics g) {
        for (int i = 10; i < grid.length; i+=35) {
            for (int j = 10; j < grid[i].length; j+=35) {
                
                g.setColor(Color.BLACK);
                g.drawRect(i, j, 35, 35);
                grid[i][j].draw(g);    
            }
        }

    }


}