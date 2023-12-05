import javax.swing.*;
import java.awt.*;
import java.util.Random;
abstract class Shape {
    protected Color color;
    protected int x, y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    abstract void draw(Graphics g);
}
