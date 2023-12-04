import java.lang.*;
public class Book
{
    private String name;
    private String author;
    private int year;

    public Book(String n, String c, int a) {
        name = n;
        author = c;
        year = a;
    }
    public Book(String n) {
        name = n;
        author = "Unknown";
        year = 0;
    }
    public Book()
    {
        name = "Bible";
        author = "Unknown";
        year = 0;
    }
    public void setyear(int year)
    {
        this.year = year;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setauth(String auth)
    {
        this.author = auth;
    }
    public String getname()
    {
        return this.name;
    }
    public String getauthor()
    {
        return this.author;
    }
    public int getyear()
    {
        return this.year;
    }
    public String toString()
    {
        return this.name+", year "+this.year + ", author " + this.author;
    }
}
