public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        this.name = n;
        this.email = e;
        this.gender = g;

    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public char getGender()
    {
        return this.gender;
    }
    public void setEmail(String n)
    {
        this.email = n;
    }
    public String to_String()
    {
        String s;
        s = this.name+"("+this.gender+") "+"at "+this.email;
        return s;
    }

}
