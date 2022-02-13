import javax.lang.model.util.ElementScanner14;

public class palindrome {
    public static void main(String args[])
    {
        int num,newnum=0,dig;
        num=12121;
        int temp= num;
        while (num!=0)
        {
            dig=num%10;
            newnum=(newnum*10)+dig;
            num=num/10;
        }
        if (temp==newnum)
        {
            System.out.println("The given number is a palindrome");
        }
        
        else 
        {
        System.out.println("The given number is not a palindrome");
        }
    }
    
}
