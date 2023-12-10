
public class UnfairWaitList<E> extends WaitList<E>
{
   public UnfairWaitList()
   {
       super();
   }
   public void remove(E elem)
   {
       boolean rem = false;
       for(int i = 0; i < components.size(); i++)
       {
           E el = components.remove();
           if(!rem && el.equals(elem))
           {
               rem = true;
           }
           else
           {
               components.add(el);
           }
       }
       if(rem)
       {
           components.add(components.remove());
       }
   }
   public void moveToBack(E elem)
   {
       int pSize = components.size();
       remove(elem);
       if(components.size() < pSize)
       {
           components.add(elem);
       }
   }
}
