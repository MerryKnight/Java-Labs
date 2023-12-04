public abstract class Furniture
{
    private String material;
    private String color;
    private int price;
    public Furniture()
    {
        material = "wood";
        color = "white";
        price = 1;
    }
    public String getMaterial()
    {
        return this.material;
    }
    public String getColor()
    {
        return this.color;
    }
    public int getPrice()
    {
        return this.price;
    }
    
    public void setMaterial(String m)
    {
        this.material = m;
    }
    public void setColor(String c)
    {
        this.color = c;
    }
    public void setPrice(int p)
    {
        this.price = p;
    }
    
    public abstract String toStr();
    
}
class Chair extends Furniture
{
    private boolean upholstery;
    private String type;
    
    public Chair()
    {
        upholstery = false;
        type = "";
    }
    public Chair(boolean up, String t)
    {
        this.upholstery = up;
        this.type = t;
    }
    @Override
    public String toStr()
    {
        return "---CHAIR--- Material: " + this.getMaterial() + ", Price: " + this.getPrice() + ", Color: " + this.getColor() + ", Upholstery: " + this.upholstery + ", Type: " + this.type;
    }
}
class Table extends Furniture
{
    private String shape;
    private int personamount;
    
    public Table()
    {
        shape = "square";
        personamount = 4;
    }
    public Table(String s, int a)
    {
        this.shape = s;
        this.personamount = a;
    }
    @Override
    public String toStr()
    {
        return "---TABLE--- Material: " + this.getMaterial() + ", Price: " + this.getPrice() + ", Color: " + this.getColor() + ", Shape: " + this.shape + ", Amount of person: " + this.personamount;
    }
}