import java.lang.*;
public class Dog
{
    private String name;
    private int age;
    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    public Dog(String n) {
        name = n;
        age = 0;
    }
    public Dog()
    {
        name = "123";
        age = 1;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return this.name;
    }
    public int getage()
    {
        return this.age;
    }
    public String toString()
    {
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println("Human age: " + 7*age);
        
    }
}
