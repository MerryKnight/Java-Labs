
public class Student
{
   private int id;
   private String name;
   private Integer GPA;
   public Student(int id, String name, Integer GPA)
   {
       this.id = id;
       this.name = name;
       this.GPA = GPA;
   }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public Integer getGPA()
    {
        return GPA;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGPA(int GPA)
    {
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", GPA = " + GPA +
                '}';
    }
}

