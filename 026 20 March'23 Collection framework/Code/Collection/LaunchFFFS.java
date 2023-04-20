
import java.util.*;
import java.util.concurrent.*;

public class LaunchFFFS 
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        // for(int i=0;i<al.size();i++)
        // {
        //     System.out.println(al.get(i));
        //     al.add(100);
        // }


    //fail fast
        Iterator itr=al.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
           // al.add(100);
        }

        //fail safe
        CopyOnWriteArrayList al1=new CopyOnWriteArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);

        Iterator itr1=al1.iterator();

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
           al1.add(100);
        }

        
        
        
    }
    
}
