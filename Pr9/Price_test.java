public class Price_test
{
   public static void main(String[] args)
    {
        Priceable p1 = new Product(24000);
        Priceable p2 = new Product(32000);
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
    }
}
