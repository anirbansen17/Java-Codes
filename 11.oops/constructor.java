class reactangle
{
    private int length ;
    private int breadth ;

    public double area()
    {
        return ( length * breadth );
    }

    // public reactangle ()
    // {
    //     length = 7 ;
    //     breadth = 5 ;                                   //non parameterized
    // }
    public reactangle ( int l , int b)
    {
        length = l ;
        breadth = b ;                                  // parameterized
    }
}


public class constructor 
{
    public static void main(String[] args) {

        reactangle reac1 = new reactangle(2 , 4);
        System.out.println(reac1.area()) ;
        
    }
    
}
