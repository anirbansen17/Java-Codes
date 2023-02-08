import java.lang.*;
import java.util.*;

public class studentchallenge3 
{
    public static void main(String[] args) 
    {
        System.out.printf("Enter your number : ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.printf(" %d is an even number\n " , a);
            System.out.println(a + " is an even number ");
        }
        else
        {
            System.out.printf(" %d is a odd number " , a);
        }
        
    }
    
}
