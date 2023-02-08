class circle 
{
    public double radius ;
    public double area()
    {
        return ( Math.PI * radius *radius);
    }
}

public class circle1 
{
    public static void main(String[] args) 
    {
        circle c1 = new circle();
        c1.radius = 7 ;
        System.out.println(c1.area());
        
    }
}
