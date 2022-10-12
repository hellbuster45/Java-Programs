import java.util.Scanner;
public class StringInput
{ 
    public static void main(String[] args)
    {
        String a;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your line: ");
        a=input.nextLine();
        
        System.out.println("Entered line is-> " + a);
        input.close();
    }
}
