package Data_Structures.Arrays;

/** --Description
 * 1) Finding maximum and minimum element of an array
 * 2) Finding Kth largest and smallest element in the array
 *      Method -> Sort the array in increasing order and then find the respective elements
 */

import java.util.Scanner;

class mm
{
    int arr[];
    int max = 0, min = 1000;
    static Scanner grasp = new Scanner(System.in);
    
    mm()
    {
        arr = new int[10];
    }

    mm(int num)
    {
        arr = new int[num];
    }

    void maxmin()
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }
        }
    }

    void Kth_MaxMin()
    {
        int a = 0;

        //Sorting the array
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        int k;
        System.out.println("Enter the value for Kth largest or least element: ");
        k = grasp.nextInt();

        System.out.println(k + " Maximum element: " + arr[(arr.length - k)] + "\n" + k + " Minimum element: " + arr[(-1 + k)]);
    }

    void init()
    {
        System.out.println("Enter numbers: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = grasp.nextInt();
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


public class MaxMinElement 
{
    public static void main(String[] args) 
    {
        int num;
        
        System.out.println("Enter the amount of numbers to be entered: ");
        num = mm.grasp.nextInt();
        
        mm obj = new mm(num);

        obj.init();
        obj.display();
        obj.Kth_MaxMin();
    }
}
