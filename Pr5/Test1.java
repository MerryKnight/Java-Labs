package src;

public class Test1 {
    public static void main(String[] args)
    {
        MovablePoint p1 = new MovablePoint(0,0,1,3);
        MovablePoint p2 = new MovablePoint(0,0,0,0);
        MovableCircle c1 = new MovableCircle(0,0,2,3,10,p2);

        MovablePoint a = new MovablePoint(0,0,0,0);
        MovablePoint b = new MovablePoint(0,0,0,0);
        MovableRectangle r = new MovableRectangle(0,0,3,3,1,1,a,b);
        System.out.println(p1.toStringg());
        System.out.println("\n");
        System.out.println(c1.toStringg());

        p1.moveUp();
        p1.moveUp();
        p1.moveUp();
        p1.moveRight();
        p1.moveRight();

        c1.moveUp();
        c1.moveUp();
        c1.moveUp();
        c1.moveRight();
        c1.moveRight();

        System.out.println(p1.toStringg());
        System.out.println("\n");
        System.out.println(c1.toStringg());

        System.out.println(r.toStringg());
        r.moveDown();
        r.moveDown();
        r.moveDown();
        r.moveDown();
        r.moveDown();
        r.moveDown();
        System.out.println("\n");
        System.out.println(r.toStringg());

    }

}
