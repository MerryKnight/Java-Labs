public abstract class Dog
{
    private String color;
    private String name;
    private String s;
    private int age;
    
    public Dog()
    {
        color = "black";
        name = "Jimbo";
        s = "male";
        age = 3;
    }
    public Dog(String c, String n, String s)
    {
        this.color = c;
        this.name = n;
        this.s = s;
        this.age = 0;
    }
    public Dog(String c, String n, String s,int a)
    {
        this.color = c;
        this.name = n;
        this.s = s;
        this.age = a;
    }
    
    public String getColor()
    {
        return this.color;
    }
    public String getName()
    {
        return this.name;
    }
    public String getS()
    {
        return this.s;
    }
    public int getAge()
    {
        return this.age;
    }
    
    public void setColor(String c)
    {
        this.color = c;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setS(String s)
    {
        this.s = s;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public abstract String toStr();
    
}
class Pug extends Dog
{
    public Pug()
    {
        super("white", "Jimmy", "male",2);
    }
    public Pug(String c,String n, String s, int a)
    {
        super(c,n,s,a);
    }
    public String snore()
    {
        return "Hhrrr... Zzz... Hrrrr";
    }
    @Override
    public String toStr()
    {
        return this.getColor() + " " + this.getName() + " " + this.getS() + " " + this.getAge();
    }
}
class Spitz extends Dog
{
    public Spitz()
    {
        super();
    }
    public Spitz(String c,String n, String s, int a)
    {
        super(c,n,s,a);
    }
    public String bark()
    {
        return "Aff.. af. aff.. AF";
    }
    @Override
    public String toStr()
    {
        return this.getColor() + " " + this.getName() + " " + this.getS() + " " + this.getAge();
    }
}
