import java.lang.*;
import java.util.*;

public class areaoftriangle 
{
    public static void main (String args[])
    {
        System.out.println(" Enter the base length , b : ");
        Scanner sc = new Scanner (System.in);
        float b = sc.nextFloat();

        System.out.println(" Enter the height , h : ");
        Scanner s = new Scanner (System.in);
        float h = s.nextFloat();

        double c = (0.5 * b * h);
        System.out.println(" Area of triangle : " +c);

    }
}
