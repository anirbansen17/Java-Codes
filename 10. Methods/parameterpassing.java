import java.lang.*;
import java.util.*;

 
public class parameterpassing 
{

    //parameter passing by value ( just for understanding)


    // static int add (int x , int y)
    // {
    //     // int z=x+y;
    //     // return z ;
        
    // }

    // public static void main(String[] args) 
    // {
    //     int a=10, b=45, c ;
    //     c = add (a,b);
    //     System.out.println(c);
        

    // }


    // //parameter passing by reference ( just for understanding)


    static void welcome (String name )
    {
        System.out.println("Welcome Mr./Mrs. " + name );
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter your name :  ");
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        welcome(str);
    }
    
}
