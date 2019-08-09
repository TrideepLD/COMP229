import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    public class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
            public void paint(Graphics g) {

            // Cells cell = new Cells(10, 10);
            // cell.draw(g);

            // Grids grid = new Grids(1, 1);
            // grid.drawGrid(g);
            
            for(int i = 10; i < 710; i+=35) {
                for(int j = 10; j < 710; j+=35) {
                    extracted(g, i, j);            
                }
            }

            if(getMousePosition() != null){
                g.setColor(Color.RED);
                g.drawOval((int)getMousePosition().getX()-5, (int)getMousePosition().getY()-5, 10, 10);
            }
            
        }


        private void extracted(Graphics g, int i, int j) {
            g.setColor(Color.WHITE);
            g.fillRect(i, j, 35, 35);
            g.setColor(Color.BLACK);
            g.drawRect(i, j, 35, 35);
        }
    }


    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas); // What should be the content of the JFrame
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while(true) {
            this.repaint();
        }
    }
}