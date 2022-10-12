import java.util.Scanner;

class Conditional_Operator{
    public static void main(String[] args)
    {
        int a = 340069, b = 568; byte choice = 0;
        System.out.printf("Entered numbers are: %d  and %d\n", a, b);
        System.out.println("--->Enter 1 for addition--->Press 2 for subtraction: ");
        Scanner grasp = new Scanner(System.in);
        choice = grasp.nextByte();

        System.out.println("answer is: " + (choice == 1 ? a+b : a-b));
        grasp.close();
    }
}