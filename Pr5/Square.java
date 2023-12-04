package src;

public class Square extends Rectangle
{
    public Square()
    {
        width = 0;
    }
    public Square(double s)
    {
        width = s;
    }
    public Square(double s, String c, boolean f)
    {
       width = s;
       color = c;
       filled = f;
    }
    public double getSide()
    {
        return width;
    }

    @Override
    public String toStringg() {
        return super.toStringg();
    }

    @Override
    public void setLength(double l) {
        this.width = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
    }
}
