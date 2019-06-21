package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UserDefArrayListTwo
{
    public static void main(String[] args)
    {
        Student sOne = new Student();
        Student sTwo = new Student();

        sOne.setName("Mihir");
        sOne.setRoll(21);
        sOne.setDept("CSE");

        sTwo.setName("Ankit");
        sTwo.setRoll(20);
        sTwo.setDept("CSE");

        TreeMap tm = new TreeMap();
        tm.put(1, sOne);
        tm.put(2, sTwo);

        Set set = tm.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            Student std = (Student) me.getValue();
            System.out.println(std.name + " --> " + std.roll + " --> " + std.dept);
            System.out.println(std.getName() + " --> " + std.getRoll() + " --> " + std.getDept());
        }
    }
}
