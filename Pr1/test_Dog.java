import java.lang.*;
public class test_Dog
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Jimbo",2);
        Dog d2 = new Dog("Bimbo",3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.getname());
        System.out.println(d1.getage());
        d2.intoHumanAge();

    }
}