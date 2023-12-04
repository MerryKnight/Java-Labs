import java.lang.*;
public class Ball
{
    private String name;
    private String color;
    public Ball(String n, String c) {
        name = n;
        color = c;
    }
    public Ball(String n) {
        name = n;
        color = "White";
    }
    public Ball()
    {
        name = "123";
        color = "White";
    }
    public void setcolor(String c)
    {
        this.color = c;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return this.name;
    }
    public String getcolor()
    {
        return this.color;
    }
    public String toString()
    {
        return this.name+", color "+this.color;
    }
}
