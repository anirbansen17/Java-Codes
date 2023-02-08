import java.lang.*;
import java.util.*;

public class practisingobjectpassing 
{
    static void update (int A[],int index ,int value )
    {
        A[index]= value ;
    }

    public static void main (String args[])
    {
        System.out.printf("Enter the index [ 0 -4 ] :  " );
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.printf("Enter the value :  " );
   
        int value = sc.nextInt();
        int A[]={2,4,6,8,10};
        update(A , index , value);
        for(int i=0 ; i<5 ; i++)
        {
            System.out.printf("%d" , A[i]);
        }

    }
}
