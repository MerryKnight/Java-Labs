
import java.util.*; 
public class FurnitureShop
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Furniture Shop!");
        Chair ch1 = new Chair();
        
        Chair ch2 = new Chair(true,"one-sit");
        ch2.setMaterial("wood");
        ch2.setPrice(100);
        ch2.setColor("white");
        
        Chair ch3 = new Chair(false,"two-sit");
        ch3.setMaterial("wood");
        ch3.setPrice(200);
        ch3.setColor("brown");
        
        Table t1 = new Table();
        Table t2 = new Table("square",4);
        t2.setMaterial("wood");
        t2.setPrice(300);
        t2.setColor("chocolate");
        
        Table t3 = new Table("rectangle",8);
        t3.setMaterial("glass");
        t3.setPrice(150);
        t3.setColor("black");
        
        System.out.println("0 - exit, 1-6 - buy");
        System.out.println("1 " + ch1.toStr());
        System.out.println("2 " + ch2.toStr());
        System.out.println("3 " + ch3.toStr());
        System.out.println("4 " + t1.toStr());
        System.out.println("5 " + t2.toStr());
        System.out.println("6 " + t3.toStr());
        
        int[] prices = {ch1.getPrice(), ch2.getPrice(), ch3.getPrice(), t1.getPrice(), t2.getPrice(), t3.getPrice()};
        int ch;
        
        Scanner sc=new Scanner(System.in);  
        int sum = 0;
        
        do
        {
            ch = sc.nextInt();
            if(ch == 1) sum+=prices[ch-1];
            if(ch == 2) sum+=prices[ch-1];
            if(ch == 3) sum+=prices[ch-1];
            if(ch == 4) sum+=prices[ch-1];
            if(ch == 5) sum+=prices[ch-1];
            if(ch == 6) sum+=prices[ch-1];
        }while(ch != 0);
        System.out.println("Final price = $" + sum);
        
    }
}
