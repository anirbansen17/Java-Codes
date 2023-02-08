public class problem3 
{
    public static void main(String[] args) 
    {
        int b ;
        int A[] = {4,5, 7 ,2};
        for ( int i=0 ; i <3 ; i++)
        {
            
            if (A[i+1]>A[i])
            b=A[i+1];
        }
        System.out.println(b);
        
    }
    
}
