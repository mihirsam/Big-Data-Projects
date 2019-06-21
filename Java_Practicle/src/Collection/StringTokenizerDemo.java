package Collection;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        String msg = "Hello, How are you?";
        StringTokenizer str = new StringTokenizer(msg, ",");

        TreeSet ts = new TreeSet();

        while(str.hasMoreElements())
        {
            String temp = (String) str.nextElement();
            System.out.println(temp);
            ts.add(temp);
        }

        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
