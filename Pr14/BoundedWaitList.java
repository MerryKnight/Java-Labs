import java.util.Collection;
public class BoundedWaitList<E> extends WaitList<E>
{
    private int capacity;
    
    public BoundedWaitList(int capacity){
        super();
        if(capacity <= 0) throw new IllegalArgumentException("Maximum size must be > 0, you've got: " + capacity);
        this.capacity = capacity;
    }
    public BoundedWaitList(Collection<E> c)
    {
        super(c);
        this.capacity = c.size();
    }    
    public int getCapacity()
    {
        return capacity;
    }
    @Override
    public void add(E elem)
    {
        if(components.size() == capacity) throw new IllegalStateException("Queue is full!");
        components.add(elem);
    }
    @Override
    public String toString()
    {
        return "BoundedWaitList {" +
                "capacity = " + capacity +
                ", components = " + components +
                "}";
    }
}
