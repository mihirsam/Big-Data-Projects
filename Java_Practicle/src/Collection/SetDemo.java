package Collection;

import java.util.*;

public class SetDemo
{
    public static void main(String[] args)
    {
        // Random Order
        System.out.println("\nHash Set : ");
        HashSet hs = new HashSet();
        hs.add("Mihr");
        hs.add("Mayur");
        hs.add("Neelabh");
        hs.add("Suraj");
        hs.add("Anurag");
        hs.add("Praveen");
        hs.add("Praveen");

        Iterator itr = hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // Insertion Order
        System.out.println("\nLinked Hash Set : ");
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("Mihr");
        lhs.add("Mayur");
        lhs.add("Neelabh");
        lhs.add("Suraj");
        lhs.add("Anurag");
        lhs.add("Praveen");
        lhs.add("Praveen");

        itr = lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Sorted Order
        System.out.println("\nTree Set : ");
        TreeSet ts = new TreeSet();
        ts.add("Mihr");
        ts.add("Mayur");
        ts.add("Neelabh");
        ts.add("Suraj");
        ts.add("Anurag");
        ts.add("Praveen");
        ts.add("Praveen");

        itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
