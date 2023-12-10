
import javax.management.Query;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        exc1 ob = new exc1();
        ob.exceptionDemo();
        exc2 ob1 = new exc2();
        ob1.exceptionDemo(); 
        
        ThrowsDemo d1 = new ThrowsDemo();
        d1.getKey();
    }
}
