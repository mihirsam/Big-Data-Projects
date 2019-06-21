package Exception;

class Calculator
{
    int x = 25;
    int y = 0;

    public void res()
    {
        try
        {
            int z;
            z = x/y;
            System.out.println("The Result is : "+z);
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("\nAlways execute!");
        }
    }

    public void showX()
    {
        System.out.println("The Value of x : "+x);
    }

    public void showY()
    {
        System.out.println("The Value of y : "+y);
    }
}

public class UncheckedException
{
    public static void main(String[] args)
    {
        Calculator cl = new Calculator();
        cl.res();
        cl.showX();
        cl.showY();
    }
}
