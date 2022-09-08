import java.util.Scanner;
public class Digcount 
{
    public static void main(String[] args) 
    {
        int num, dig, a;short count = 0;
        byte chdig;
        Scanner grasp = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = grasp.nextInt();
        a = num;
        System.out.println("Enter the digit to find occurence of : ");
        chdig = grasp.nextByte();
        do
        {
            
            dig =(short)(num % 10);
            if(dig == chdig)
            {
                count++;
            }
            num /= 10;
        }while(num != 0);
        System.out.printf("%d is repeated %d times in %d", chdig, count, a);
        grasp.close();
    }
}
