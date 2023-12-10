
import java.util.Scanner;
public class ThrowsDemo
{
    public void getKey() {
     Scanner myScanner = new Scanner( System.in );
     boolean goodInput = false;
     while(!goodInput)
     {
         try{
            String key = myScanner.next();
            if(key.trim().isEmpty())
            {
                throw new Exception("Key is empty!");
            }
            printDetails(key);
            goodInput = true;
         }catch(Exception e)
         {
             System.out.println("Exception!!: " + e.getMessage());
             
         }
     }
    }
     public void printDetails(String key) throws Exception {
         try { 
             String message = getDetails(key);
             System.out.println(message);
         }catch ( Exception e){
             throw e;
         }
     }
     private String getDetails(String key) throws Exception{
         if(key == "") {
             throw new Exception("Key set to empty string");
         }
         return "data for " + key; 
        }
         
}

