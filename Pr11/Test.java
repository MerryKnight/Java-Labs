
import java.util.Arrays;
public class Test
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];
        students[0] = new Student(123, "John", 6);
        students[1] = new Student(231, "Jim", 3);
        students[2] = new Student(321, "Danny", 7);
        students[3] = new Student(213, "Denis", 5);
        students[4] = new Student(132, "Bryan", 9);
        int[] idnum = new int[5];
        for(int i = 0; i<5;i++)
        {
            idnum[i] = students[i].getId();
        }
        System.out.println("Before: " + Arrays.toString(idnum));
        for (int left = 0; left < idnum.length; left++) {
    int value = idnum[left];
    int i = left - 1;
    for (; i >= 0; i--) {
        if (value < idnum[i]) {
            idnum[i + 1] = idnum[i];
        } else {
            break;
        }
    }
            idnum[i + 1] = value;
        }
        System.out.println("After: " + Arrays.toString(idnum));
    }
}
