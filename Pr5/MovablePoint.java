package src;

public class MovablePoint implements Movable{

    @Override
    public void moveDown()
    {
        y-=ySpeed;
    }
    @Override
    public void moveLeft()
    {
        x-=xSpeed;
    }
    @Override
    public void moveRight()
    {
        x+=xSpeed;
    }
    @Override
    public void moveUp()
    {
        y+=ySpeed;
    }
    public int x,y,xSpeed,ySpeed;
    public MovablePoint(int x1, int y1, int xs, int ys)
    {
        x = x1;
        y = y1;
        xSpeed = xs;
        ySpeed = ys;
    }
    public String toStringg()
    {
        return "x = "+x+"\ny = "+y
                +"\nxSpeed = "+xSpeed+"\nySpeed = "+ySpeed;
    }




}
