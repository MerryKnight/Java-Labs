import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
public class Main {
    public static int fact(int c)
    {
        int res = 1;
        for(int i = 2; i<=c;i++)
        {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        //1
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int s = 0;
        System.out.println("***TASK 1***");
        for(int i = 0; i<9; i++)
        {
           s = s + a[i];
        }
        System.out.println(s);

        int i = 0;
        s = 0;
        while(i!=9)
        {
            s = s + a[i];
            i+=1;
        }
        System.out.println(s);

        s = 0;
        i = 0;
        do {
            s = s + a[i];
            i+=1;
        }while(i!=9);
        System.out.println(s);
        System.out.println();
        System.out.println("***TASK 2***");

        //2
        String str = "";
        Scanner in = new Scanner(System.in);
       
        for(i = 0; i<3;i++)
        {
            str = in.nextLine();
            System.out.println(str);
        }
        System.out.println();
        System.out.println("***TASK 3***");
        //3
        double res;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(i = 1; i<11.0f; i++)
        {
            res = 1.0f/i;
            System.out.println(df.format(res));
        }
        System.out.println();
        System.out.println("***TASK 4***");
        //4
        int[] arr = new int[10];
        for (i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 31) - 15);
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\n");
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("***TASK 5***");
        //5
        System.out.println(fact(5));
    }
}