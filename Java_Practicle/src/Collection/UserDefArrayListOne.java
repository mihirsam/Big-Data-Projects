package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefArrayListOne
{
    public static void main(String[] args)
    {
        Product pOne = new Product();
        Product pTwo = new Product();

        pOne.setPname("TV");
        pOne.setPrice(1000.50);
        pTwo.setPname("Laptop");
        pTwo.setPrice(3000.70);

        ArrayList<Product> arr = new ArrayList<Product>();
        arr.add(pOne);
        arr.add(pTwo);

        Iterator<Product> itr = arr.iterator();
        while(itr.hasNext())
        {
            Product pct = (Product) itr.next();
            System.out.println(pct.getPname()+"-->"+pct.getPrice());
        }
    }
}
