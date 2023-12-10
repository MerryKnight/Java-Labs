
import java.util.Scanner;
public class exc2
{
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try{
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
        }catch (Exception e)
        {
            System.out.println("An error occurred:  " + e.getMessage());
        } finally
        {
            System.out.println("Always executes.");
        }
    }
}
