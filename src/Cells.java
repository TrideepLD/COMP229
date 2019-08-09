import java.awt.*;

public class Cells {
    int xAxis;
    int yAxis;
    int size = 35;

    public Cells(int x, int y) {
        xAxis = x;
        yAxis = y;
    }

    public void draw(Graphics g) {
        for (int i = 10; i < 710; i+=size) {
            g.setColor(Color.BLACK);
            g.drawRect(xAxis, yAxis, size, size);    
        }
        
    }

}