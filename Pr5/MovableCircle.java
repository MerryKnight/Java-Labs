package src;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;
    @Override
    public void moveDown()
    {
        center.moveDown();
    }
    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }
    @Override
    public void moveRight()
    {
        center.moveRight();
    }
    @Override
    public void moveUp()
    {
        center.moveUp();
    }
    public String toStringg()
    {
        return "x = "+center.x+"\ny = "+center.y
                +"\nxSpeed = "+center.xSpeed+"\nySpeed = "+center.ySpeed+"\nradius = "+radius;
    }
    public MovableCircle(int x1, int y1, int xs, int ys, int r, MovablePoint center)
    {
        this.center = center;
        this.center.x = x1;
        this.center.y = y1;
        this.center.xSpeed = xs;
        this.center.ySpeed = ys;
        radius = r;
    }
}
