package Data_Structures.Arrays;

import java.util.Scanner;
import java.util.Arrays;

class shift
{
    static byte arr[] = {0, 1, 2, 3, 4, 5};


    void rtShift(byte n)
    {
        System.out.println("\nOriginal Array: ");
        System.out.println(Arrays.toString(arr));
        byte j = 0;
        while(n != 0)
        {        
            byte temp = arr[(arr.length - 1)];//Stores the last element of the resultant array after every iteration.

            for(int i = arr.length - 2; i > -1; i--)//Shifts all elements from (index - 2) towards the right once. 
            {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;//Placig last element of the previous resultant array at the beginning of the current array.

            System.out.println("\nArray after " + (++j) + " right shift(s): ");
            System.out.println(Arrays.toString(arr)); 
            n--;//Decreasing the number of cycles every iteration(else infinite loop).
        }
    }

    void ltShift(byte n)
    {
        System.out.println("\nOriginal Array: ");
        System.out.println(Arrays.toString(arr));
        byte j = 0;
        while(n != 0)
        {        
            byte temp = arr[0]; //Stores the first element of the array after every iteration.

            for(int i = 1; i <arr.length; i++) //Shifts all elements from first index towards the left once. 
            {
                arr[i - 1] = arr[i];
            }
            arr[(arr.length - 1)] = temp; //Placig first element of the previous array at the last of the current array.

            System.out.println("\nArray after " + (++j) + " left shifts(s): ");
            System.out.println(Arrays.toString(arr)); 
            n--; //Decreasing the number of cycles every iteration(else infinite loop).
        }
    }
}


public class Left_Right_Shift
{   
    public static void main(String[] args) 
    {
        byte n = 0;
        Scanner grasp = new Scanner(System.in);

        System.out.println("How many times do you want to shift the array elements? :");
        n = grasp.nextByte();

        shift obj  = new shift();
        System.out.println("\n--> Press 1 for left shift\n-->Press 2 for right shift\n-->Press 3 to print the resultant array");
        byte choice = grasp.nextByte();
        switch(choice)
        {
            case 1: 
            {

                obj.ltShift(n);
                break;
            }

            case 2: 
            {
                obj.rtShift(n);
                break;

            }

            case 0:
            {
                System.out.println(Arrays.toString(shift.arr));
                break;
            }

            default:
            {
                System.out.println("\nInvalid choice!");
                break;
            }
        }

        grasp.close();
    }
}
