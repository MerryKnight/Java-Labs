import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawingPanel extends JPanel {
    private Shape[] shapes;
    public DrawingPanel() {
        shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(400); 
            int y = random.nextInt(400); 
            int width = random.nextInt(50) + 10; 
            int height = random.nextInt(50) + 10; 
            int radius = random.nextInt(30) + 10;
            if (i % 4 == 0) {
                shapes[i] = new Circle(x, y, radius);
            } else {
                shapes[i] = new Rectangle(x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
