package Data_Structures.Arrays;

/** --Description
 * Sorting an array consisting of only 0, 1 and 2
 * Without any Sorting algorithm
 */

public class sort_0s_1s_2s 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 0, 2, 0, 1, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 2, 1, 1, 1, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0}, count0 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < arr.length; i++)
        {
            switch(arr[i])
            {
                case 0:
                {
                    count0++;
                    break;
                }

                case 1: 
                {
                    count1++;
                    break;
                }

                case 2: 
                {
                    count2++;
                    break;
                }
            }
        }

        System.out.println(count0 + " " + count1 + " " + count2 + " " +(count0 + count1 + count2)); 
        
        int i = 0;
        
        while(count0 != 0)
        {
            arr[i++] = 0;
            count0--;
        }

        while(count1 != 0)
        {
            arr[i++] = 1;
            count1--;
        }

        while(count2 != 0)
        {
            arr[i++] = 2;
            count2--;
        }

        for(int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
