import java.util.Scanner;
public class DectoHex{
    public static void main(String[] args)
        {
            int dec, quot, rem, i = 0, j;
            int arr[] = new int[10];
            Scanner grasp = new Scanner(System.in);
            System.out.println("Enter any number: ");
            dec = grasp.nextInt();
            do
            {
                
                quot = dec / 16;
                rem = dec % 16;
                dec = quot;
                arr[i] = rem;
                i++; 
            }while(quot != 0);
                
            System.out.println("Hexadecimal conversion is: ");
            for(j = (i-1); j >= 0; j--)
            {
                if(arr[j] > 9)
                {
                    if(arr[j] == 10)
                    {
                        System.out.print("A");
                        continue;
                    }
                    else if(arr[j] == 11)
                    {
                        System.out.print("B");
                        continue;
                    }
                    else if(arr[j] == 12)
                    {
                        System.out.print("C");
                        continue;
                    }
                    else if(arr[j] == 13)
                    {
                        System.out.print("D");
                        continue;
                    }
                    else if(arr[j] == 14)
                    {
                        System.out.print("E");
                        continue;
                    }
                    else if(arr[j] == 15)
                    {
                        System.out.print("F");
                        continue;
                    }
                }
                System.out.print(arr[j]);
            }
            grasp.close();
        }
}
