import java.lang.*;
import java.util.*;

public class bitwise 
{
    public static void main(String args[])
    {
        int x = 0b1010 ;
        int y = 0b0110 ;

        int z = x&y ;
        int q = x|y ;
        int v = x^y ;

        System.out.println( z );
        System.out.println( q );
        System.out.println( v );
    }

}
