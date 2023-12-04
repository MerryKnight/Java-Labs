public abstract class Dish
{
    
    private String color;
    private String material;
    
    public Dish()
    {
        color = "white";
        material = "ceramics";
        
    }
    public Dish(String c, String m)
    {
        this.color = c;
        this.material = m;
    }
    public Dish(String c)
    {
        this.color = c;
        this.material = "ceramics";
    }
    
    public String getColor()
    {
        return this.color;
    }
    public String getMaterial()
    {
        return this.material;
    }
    
    public void setColor(String c)
    {
        this.color = c;
    }
    public void setMaterial(String m)
    {
        this.material = m;
    }
    
    public abstract String toStr();
}
class Plate extends Dish
{
    private String shape;
    private String purpose;
    
    public Plate()
    {
        super("white","ceramics");
        shape = "oval";
        purpose = "soup";
        
    }
    public Plate(String c, String m, String sh, String p)
    {
        super(c,m);
        this.shape = sh;
        this.purpose = p;
    
    }
    
    public String getShape()
    {
        return this.shape;
    }
    public String getPurpose()
    {
        return this.purpose;
    }
    
    public void setShape(String s)
    {
        this.shape = s;
    }
    public void setPurpose(String p)
    {
        this.purpose = p;
    }
    
    @Override
    public String toStr()
    {
        return this.getColor() + " " + this.getMaterial() + " " +  this.shape + " " + this.purpose;
    }
}
class Cup extends Dish
{
    private String capacity;
    public Cup()
    {
        super("white","ceramics");
        capacity = "500 ml";
    }
    public Cup(String c, String m, String cap)
    {
        super(c,m);
        this.capacity = cap;
    }
    
    public String getCapacity()
    {
        return this.capacity;
    }
    public void setCapacity(String cap)
    {
        this.capacity = cap;
    }
    
    @Override
    public String toStr()
    {
        return this.getColor() + " " + this.getMaterial() + " " + this.capacity;
    }
    
}
