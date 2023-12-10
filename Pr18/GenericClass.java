 
import java.io.Serializable;
interface Animal {
        void voice();
    }
    class Dog implements Serializable, Animal {

        public void voice() {
            System.out.println("af af!");
        }   
    }
public class GenericClass<T extends Comparable<T>, V extends Serializable & Animal, K>
{
    private T variableT;
    private V variableV;
    private K variableK;
    
    public GenericClass(T variableT, V variableV, K variableK)
    {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
        
    }
    public T getVariableT()
    {
        return variableT;
    }
    public V getVariableV()
    {
        return variableV;
    }
    public K getVariableK()
    {
        return variableK;
    }
    public void printnames()
    {
        System.out.println("Type of T: " + variableT.getClass().getName());
        System.out.println("Type of V: " + variableV.getClass().getName());
        System.out.println("Type of K: " + variableK.getClass().getName());
    }
}
