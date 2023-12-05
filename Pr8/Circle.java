import java.awt.*;
class Circle extends Shape
{
    private int r;
    public Circle(int x,int y, int r)
    {
        super(x,y);
        this.r = r;
    }
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, r*2,r*2);
    }
}
