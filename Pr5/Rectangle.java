package src;

public class Rectangle extends Shape {

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public String toStringg() {
        return null;
    }

    protected double width;
    protected double length;
    public Rectangle()
    {
        width = 0.0;
        length = 0.0;
    }
    public Rectangle(double w,double l)
    {
        width = w;
        length = l;
    }
    public Rectangle(double w,double l,String c, boolean f)
    {
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double w)
    {
        this.width = w;
    }
    public void setLength(double l)
    {
        this.length = l;
    }
}
