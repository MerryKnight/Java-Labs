/*
1. Реализовать запись в файл введённой с клавиатуры информации
2. Реализовать вывод информации из файла на экран
3. Заменить информацию в файле на информацию, введённую с
4. клавиатуры
5. Добавить в конец исходного файла текст, введённый с клавиатуры
 */
import java.io.*;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        File file = new File("Example.txt");
        File file1 = new File("Example1.txt");
        try(FileWriter writer = new FileWriter(file)){
            writer.write(inp);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader(file))
        {
             int c;
             while((c=reader.read())!=-1){
             System.out.print((char)c);
             }
        }
        catch (IOException ex){
             System.out.println(ex.getMessage());
        }
    }
}
        
       
 


