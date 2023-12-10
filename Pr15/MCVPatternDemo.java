
public class MCVPatternDemo
{
    public static void main(String[] args)
    {
        Student model = retrieveStudent();
        StudentView view = new StudentView();
        StudentController cont = new StudentController(model,view);
        
        cont.updateView();
        
        cont.setStudentName("Bob");
        cont.setStudentRollNo("123");
        cont.updateView();
        
        Employee model1 = new Employee();
        EmployeeView view1 = new EmployeeView();
        EmployeeController cont1 = new EmployeeController(model1, view1);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/");
        cont1.setEmployeeName("Bob Bob");
        cont1.setEmployeeSalary(91234.1);
        cont1.updateView();
    }
    private static Student retrieveStudent()
    {
        return new Student();
    }
}
