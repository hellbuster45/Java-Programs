import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) 
    {
        int num, dig, revnum = 0, a;
        Scanner grasp = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = grasp.nextInt();
        a = num;
        while(num != 0)
        {
            dig = num % 10;
            revnum = (revnum * 10) + dig;
            num /= 10;
        }
        if(revnum == a)
        {
            System.out.println("Number is palindrome number....");
        }
        else{
            System.out.println("Number isn't palindrome...");
        }
        grasp.close();
    }
}
