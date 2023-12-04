public class TestDish
{
   public static void main(String[] args)
   {
        
       Plate p1 = new Plate("blue","clay","oval","salad");
       Cup c1 = new Cup();
       
       System.out.println(p1.getPurpose());
       System.out.println(c1.getCapacity());
       c1.setCapacity("250 ml");
       System.out.println(p1.toStr());
       System.out.println(c1.toStr());
       System.out.println(c1.getCapacity());
   }
}
