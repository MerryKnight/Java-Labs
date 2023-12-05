import java.util.Arrays;
import java.util.Comparator;
public class Test1 implements Comparator<Student>
{
    public static void main(String[] args)
    {
        Student[] students = new Student[2];
        students[0] = new Student(123, "John", 6);
        students[1] = new Student(231, "Jim", 3);
     
        
        
        Student[] students1 = new Student[2];
        students1[0] = new Student(421, "Nicolas", 4);
        students1[1] = new Student(124, "Ben", 2);
       
        
        Student[] result = new Student[students.length + students1.length];
        System.arraycopy(students, 0, result, 0, students.length);
        System.arraycopy(students1, 0, result, students.length, students1.length);
        System.out.println("Before: " + Arrays.toString(result));
        new Test1().mergeSort(result,4);
        System.out.println("After: " + Arrays.toString(result));
    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA().compareTo(o2.getGPA());
    }
    public void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                    if ((compare(l[i], r[j])) <= 0) { 
                        a[k++] = l[i++];
                    }
                    else {
                        a[k++] = r[j++];
                    }
                }
            while (i < left) {
                    a[k++] = l[i++];
                }
            while (j < right) {
                    a[k++] = r[j++];
                }
    }
    public void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
}
