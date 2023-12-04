public class TestDog
{
    public static void main(String[] args)
   {
        Pug p2 = new Pug("white","Jimmy","male",2);
        Spitz s1 = new Spitz();
        
        System.out.println(p2.snore());
        System.out.println(s1.bark());
        System.out.println(p2.toStr());
        System.out.println(s1.toStr());
   }
}
