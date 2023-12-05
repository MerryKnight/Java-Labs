import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(123, "John", 6);
        students[1] = new Student(231, "Jim", 3);
        students[2] = new Student(321, "Danny", 7);
        students[3] = new Student(213, "Denis", 5);
        students[4] = new Student(132, "Bryan", 9);
        System.out.println(Arrays.toString(students));
        new SortingStudentsByGPA().quickSort(students,0,4);
        
        System.out.println(Arrays.toString(students));
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA().compareTo(o2.getGPA());
    }
    public void quickSort(Student[] students,int low, int high) {
            if (students.length == 0)
                return;

            if (low >= high)
                return;

            int middle = low + (high - low) / 2;
            int i = low, j = high;
            
            while (i <= j) {
                while (compare(students[i], students[middle]) > 0) {
                    i++;
                }

                while (compare(students[j], students[middle]) < 0) {
                    j--;
                }

                if (i <= j) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                        i++;
                        j--;
                }
            }   
            if (low < j)
                quickSort(students, low, j);
            if (high > i)
                quickSort(students, i, high);
        }
}

