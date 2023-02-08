class Cylinder 
{
    private int radius ;
    private int height ;

    // public int getRadius()
    // {
    //     return radius ;
    // }
    // public void setRadius(int r)
    // {
    //     radius = r ;
    // }
    // public int getHeight()
    // {
    //     return height ;
    // }
    // public void setHeight(int h)
    // {
    //     height = h ;
    // }
    
    // public void setDimension(int r , int h)
    // {
    //     radius = r ;
    //     height = h ;
    // }

    public Cylinder()
    {
        radius = 7 ;         // non parameterized
        height = 5 ;
    }

    public Cylinder(int r , int h)
    {
        radius = r ;         // parameterized
        height = h ;
    }


    public Double volume ()
    {
        return ( Math.PI *radius*radius*height );
    }

}





public class constructorcylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder (7 , 5);
        // c.setRadius(7);
        // c.setHeight(5);
        // c.setDimension(7,5);

        // System.out.println("Radius : " +c.getRadius());
        // System.out.println("Height : " +c.getHeight());
        System.out.println("volume : " +c.volume());
        
    }
}
