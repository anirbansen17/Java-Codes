class circle
{
    public double radius ;
    public double area()
    {
        return ( Math.PI *radius  *radius  );
    }
    public double circumference()
    {
        return ( 2 * Math.PI * radius  );
    }

}
class cylinder extends circle 
{
    public double height ;
    public double volume ()
    {
        return(area()* height );
    }
}


public class circle1 
{
  public static void main(String[] args) 
  {
    cylinder c1 = new cylinder();
    c1.radius = 7 ;
    c1. height = 20 ;
    System.out.println("about 1st Cylinder - ");
    System.out.println(c1.area());
    System.out.println(c1.circumference());
    System.out.println(c1.volume());

    cylinder c2 = new cylinder();
    c2.radius = 7 ;
    c2. height = 20 ;
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("about 2nd Cylinder - ");
    System.out.println(c2.area());
    System.out.println(c2.circumference());
    System.out.println(c2.volume());
  }

}
