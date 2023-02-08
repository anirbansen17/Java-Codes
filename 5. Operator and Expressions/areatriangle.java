import java.lang.*;
import java.util.*;

public class areatriangle 
{
    public static void main (String args[])
    {
        System.out.println(" Enter length of 3 sides of the triangle : ");
        Scanner sc = new Scanner (System.in);
        int a , b, c ;
        double area , s ;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f ;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-b));

        System.out.println(" Area of the triangle : " +area );

    }
}
