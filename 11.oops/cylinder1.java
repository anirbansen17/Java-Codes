class cylinder
{ 
    //properties
    public double radius ;
    public double height ;

    //methods 
    public double lidarea()
    {
        return ( Math.PI * radius * radius );
    } 
    public double surfacearea()
    {
        return (2 * Math.PI * radius * height );
    } 
    public double volume()
    {
        return ( Math.PI * radius * radius * height );
    } 
}



public class cylinder1
{
    public static void main(String[] args)
    {
        cylinder c1 = new cylinder();
        c1.radius = 7 ;
        c1.height = 6 ;

        System.out.println(c1.lidarea());
        System.out.println(c1.surfacearea());
        System.out.println(c1.volume());
        
    }
}
