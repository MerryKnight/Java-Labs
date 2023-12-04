package src;

public abstract class Shape
{
    protected String color;
    protected boolean filled;
    public Shape()
    {
        color = "white";
        filled = false;
    }
    public Shape(String c, boolean f)
    {
        color = c;
        filled = f;
    }
    public String getColor()
{
    return this.color;
}
    public void setColor(String c)
    {
        this.color = c;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    public void setFilled(boolean f)
    {
        this.filled = f;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toStringg();

}
