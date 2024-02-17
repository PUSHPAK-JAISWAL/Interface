//unchecked exception and checked exception
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4
{
    public static void main(String args[])
    {
        int result = 7/0;//unchecked exception

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String str = br.readLine();//checked exception
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}