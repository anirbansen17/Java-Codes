public class methodpractice 
{
    int max(int x, int y)
    {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        // System.out.printf("Enter two integers : ");
        methodpractice mp = new methodpractice();
        int a = 10, b = 20, c;
        c = mp.max(a, b);
        System.out.printf("max number one is : %d \n", c);

    }

}