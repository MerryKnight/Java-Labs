import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GenericHolder<T>
{
    private T[] array;
    
    GenericHolder(T[] array)
    {
        this.array = array;
    }
    public T getelembyid(int index)
    {
        if(index >= 0 && index < array.length)
            return array[index];
        else return null;
    }
}
