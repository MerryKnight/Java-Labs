package src;

public class Circle extends Shape
{
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toStringg() {
        return null;
    }

    protected double radius;
    public Circle()
    {
        radius = 0.0;
    }
    public Circle(double r)
    {
        radius = r;
    }
    public Circle(double r,String c, boolean f)
    {
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }

}
