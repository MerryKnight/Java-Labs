import java.io.*;
import java.util.Scanner;
public class Test1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
        File file = new File("Example2.txt");
        File file1 = new File("Example21.txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1, true))) {
            
            String newText = new BufferedReader(new InputStreamReader(System.in)).readLine();
            writer.write(newText);
            writer.newLine(); 

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            String newContent = new BufferedReader(new InputStreamReader(System.in)).readLine();
            content.setLength(0); 
            content.append(newContent);
            writer.write(content.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
 } 