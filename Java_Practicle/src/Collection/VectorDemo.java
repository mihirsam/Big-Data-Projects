package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args)
    {
        Vector arr = new Vector();
        arr.add("Suman");
        arr.add("Yash");
        arr.add("Praveen");
        arr.add(10);
        arr.add(50.5);

        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() + "\t");
        }

        ListIterator ltr = arr.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next()+"\t");
        }
        while(ltr.hasPrevious())
        {
            System.out.println(ltr.previous()+"\t");
        }
    }
}
