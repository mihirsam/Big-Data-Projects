package Exception;

class Stock
{
    int qoh = 50;

    public void Issue(int req)
    {
        try
        {
            while(true)
            {
                if (req > qoh)
                {
                    throw new OutOfStockException();
                }
                this.qoh = this.qoh - req;
                System.out.println("The remaining stock is : "+this.qoh);
            }

        }
        catch(OutOfStockException ose)
        {
            ose.printStackTrace();
        }
    }
}
public class UserDefinedException
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.Issue(10);
    }
}
