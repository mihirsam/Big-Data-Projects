package Exception;
import java.sql.*;

class Java_Oracle_Conn
{
    public Connection cnn;

    public Connection getCnn()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cnn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
        }
        catch (ClassNotFoundException ce)
        {
            ce.printStackTrace();
        }
        catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
        System.out.println("Dont worry!");
        return cnn;
    }
}

public class CheckedException {
    public static void main(String[] args)
    {
        Java_Oracle_Conn joc = new Java_Oracle_Conn();
        joc.getCnn();
    }
}
