import java.util.Scanner;

public class DecimaltoBinary
{
    public static void main(String[] args)
    {
        int dec, quot, rem;       
        int i = 0, j = 0;
        int arr[] = new int[20];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        dec = scan.nextInt();
        scan.close();
        do
        {
            quot =  (dec / 2);
            rem = (dec % 2);
            dec = quot;
            arr[i] = rem;
            i++;
        }while(quot != 0);
        System.out.print("The binary conversion is: ");
        for(j = i - 1; j>=0; j--)
        {
            System.out.print(arr[j]);
        }
    }
}
