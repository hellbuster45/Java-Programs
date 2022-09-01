import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args)
    {
        int a, b, fact = 1;
        Scanner grasp = new Scanner(System.in);
        System.out.println("Enter any number: ");
        a = grasp.nextInt();
        b = a-1;
        for(int i = 1; i <= b; i++)
        {
            fact *= i;
        }

        if(a <= 1)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            String op = ((fact+1) % a == 0)? "Number is prime" : "Number is not prime";
            System.out.println(op);
        }
        grasp.close();            
    }
}
/*This program uses Wilson's Theorem to check for prime numbers */