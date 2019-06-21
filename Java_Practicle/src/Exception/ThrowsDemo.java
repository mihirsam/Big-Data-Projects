package Exception;

class CalculatorOne
{
    int x = 25;
    int y = 0;

    public void res() throws ArithmeticException, Exception
    {
        try
        {
            int z;
            z = x/y;
            System.out.println("The Result is : "+z);
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

public class ThrowsDemo {
    public static void main(String[] args) throws ArithmeticException, Exception
    {
        CalculatorOne cOne = new CalculatorOne();
        cOne.showX();
        cOne.showY();
        cOne.res();
    }
}
