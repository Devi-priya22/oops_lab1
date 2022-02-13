public class factorial {
    public static void main(String args[])
    {
        int n=6 , product=1;
        for ( int i=1;i<=n;i++)
        {
            product=product*i;
        }
        System.out.println("factorial is" + product);
    }
    
}
