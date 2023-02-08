import java.lang.*;
import java.util.*;

public class problem1 
{
    static void prime (int n)
    {
        // boolean flg = true;
        for (int i=2 ; i<n/2 ; i++)
        {
         if (n%i ==0 ){
            System.out.println(" non prime ");
            break;
            // flg = false;
         }
        else{
            System.out.println(" prime ");
            break;
            //System.out.println(" non prime ");
        }
        }
        // if(flg) System.out.println(" prime ");
        // else  System.out.println(" non prime ");
     }
    
    public static void main(String[] args)
    {
        // System.out.Println("Enter your number : ");
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        prime (n);

    }
    


}
