package Data_Structures.Arrays;

/** --Description
 * Reversing a given array
 * Method -> Two indexes(Starting(incrementing every iteration) and ending(decrementing every iteration)) 
             and swapping the elements they point to respectively... 
 */

import java.util.Scanner;

class reverse
{
    int arr[];
    static Scanner grasp = new Scanner(System.in);
    
    reverse()
    {
        arr = new int[10];
    }

    reverse(int num)
    {
        arr = new int[num];
    }

    void init()
    {
        System.out.println("Enter numbers: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = grasp.nextInt();
        }
    }

    void rev()
    {
        int a = 0;
        //Reversing array by swapping from beginning and ending positions
        for(int i = 0, j = (arr.length - 1); i < arr.length || j > (-1); i++, j--)
        {
            if((i == j) || (j < i))
            {
                return;
            }
            a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;   
        }
    }

    void display()
    {
        System.out.println("Resultant array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class ArrayReversal 
{
    public static void main(String[] args) 
    {
        int num;    
        System.out.println("Enter the amount of numbers to be entered: ");
        num = reverse.grasp.nextInt();
        reverse obj = new reverse(num);
        obj.init();
        obj.rev();
        obj.display();
    }
}
