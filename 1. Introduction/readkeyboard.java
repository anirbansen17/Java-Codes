import java.lang.* ;
import java.util.*;

class readkeyboard
{
    public static void main (String args[])
    {
        int a , b ,c ;
        System.out.println("Enter two numbers : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a+b ;
        System.out.println(" sum is " +c );
        
    }
}
