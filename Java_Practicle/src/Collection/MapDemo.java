package Collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args)
    {
        // Random Order
        System.out.println("Hash Map : \n");
        HashMap hp = new HashMap();
        hp.put("TV", new Double(30000.00));
        hp.put("TAB", new Double(30000.00));
        hp.put("REFRIGIRATOR", new Double(27000.00));
        hp.put("MOBILE", new Double(12000.00));
        hp.put("WACHINE MACHINE", new Double(40000.00));
        hp.put("LAPTOP", new Double(40000.00));
        hp.put("TV", new Double(25000.00));

        Set set = hp.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + "-->" + me.getValue());
        }

        // Insertion Order
        System.out.println("\nLinked Hash Map :");
        LinkedHashMap lhp = new LinkedHashMap();
        lhp.put("TV", new Double(30000.00));
        lhp.put("TAB", new Double(30000.00));
        lhp.put("REFRIGIRATOR", new Double(27000.00));
        lhp.put("MOBILE", new Double(12000.00));
        lhp.put("WACHINE MACHINE", new Double(40000.00));
        lhp.put("LAPTOP", new Double(40000.00));
        lhp.put("TV", new Double(25000.00));

        Set setOne = lhp.entrySet();
        itr = setOne.iterator();

        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + " ---> " + me.getValue());
        }

        //Sorted Order
        System.out.println("\nTree Map : ");
        TreeMap tm = new TreeMap();
        tm.put("TV", new Double(30000.00));
        tm.put("TAB", new Double(30000.00));
        tm.put("REFRIGIRATOR", new Double(27000.00));
        tm.put("MOBILE", new Double(12000.00));
        tm.put("WACHINE MACHINE", new Double(40000.00));
        tm.put("LAPTOP", new Double(40000.00));
        tm.put("TV", new Double(25000.00));

        set = tm.entrySet();
        itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + "--->" + me.getValue());
        }
    }
}
