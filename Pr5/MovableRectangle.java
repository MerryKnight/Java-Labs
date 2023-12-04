package src;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2,int y2,int xs, int ys,MovablePoint a,MovablePoint b)
    {
        this.topLeft = a;
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xs;
        topLeft.ySpeed = ys;

        this.bottomRight = b;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xs;
        bottomRight.ySpeed = ys;
    }
    @Override
    public void moveUp()
    {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveDown()
    {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    @Override
    public void moveLeft()
    {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    @Override
    public void moveRight()
    {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    public String toStringg()
    {
        return "topLeft x and topLeft y = "+topLeft.x+" "+topLeft.y+"\nbottomRight x and bottomRight y = "
                +bottomRight.x + " "+ bottomRight.y;
    }
}
