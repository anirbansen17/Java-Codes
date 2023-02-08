class rectangle
{
    //properties
    private double length ;
    private double breadth ;

    //methods
    public double area()
    {
        return (length*breadth);
    }
    public double perimeter()
    {
        return(2*(length+breadth));
    }
    public boolean isSquare()
    {
        if (length == breadth )
            return true ;
        else
            return false ;
    }

    // getLength & setLength method

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    } 
    public void setLength(double l)
    {
        length = l ;
    }
    public void setBreadth(double b)
    {
        breadth = b ;
    }

}


public class reactangle1 
{
    public static void main(String[] args) 
    {
        rectangle reac1 = new rectangle ();
        reac1.setLength(5);
        reac1.setBreadth(9);
        System.out.println(reac1.area());
        System.out.println(reac1.perimeter());
        System.out.println("is it a square : " + reac1.isSquare());

        System.out.println("Length : " +reac1.getLength());
        System.out.println("Breadth : " +reac1.getBreadth());
    } 
}
