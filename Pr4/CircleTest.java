
public class CircleTest {
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1,2,6);
        System.out.println(c1.area());
        System.out.println(c1.length());
        System.out.println(c1.di());
        System.out.println(c1.tostr());
    }

    public static class Circle {
        private double x = 0.0;
        private double y = 0.0;
        private double r = 0.0;

        public Circle(double a, double b, double c)
        {
            x = a;
            y = b;
            if(r >= 0)
            {
                r = c;
            }
            else
            {
                r = 0.0;
            }
        }
        public Circle()
        {
            x = 0.0;
            y = 0.0;
            r = 0.0;
        }
        public double length()
        {
            return 3.14*this.r*2;
        }
        public double area()
        {
            return this.r*(3.14*3.14);
        }
        public double di()
        {
            return this.r*2;
        }
        public String tostr()
        {
            return "x = " + this.x + " y = " + this.y + " radius = " + this.r + " D = "+ this.di();
        }

    }
}
