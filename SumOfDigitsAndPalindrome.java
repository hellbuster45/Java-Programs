import java.util.Scanner;
public class SumOfDigitsAndPalindrome {
    public static void main(String[] args) 
    {
        int num, dig, revnum, a;
        Scanner grasp = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = grasp.nextInt();
        a = num;
        System.out.println("The reverse of " + num + " is: ");
        while(num != 0)
        {
            dig = num % 10;
            System.out.print(dig);
            num /= 10;
        }
    }
}
