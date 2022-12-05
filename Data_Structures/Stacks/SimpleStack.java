package Data_Structures.Stacks;
import java.util.Scanner;

class stack
{
    int arr[];
    int top;

    stack()
    {
        this.arr = new int[20];
        this.top = -1;
    }

    stack(int n)
    {
        this.arr = new int[n];
        this.top = -1;
    }

    void push(int n)
    {
        if(this.top == (n-1))
        {
            System.out.println("Stack OVerflow!!\n");
            return;
        }
        
        Scanner grasp = new Scanner(System.in);
        int num;
        
        System.out.println("Enter elements: ");
        for(int i = (this.top + 1); i < n; i++)
        {
            this.top++;
            num = grasp.nextInt();
            arr[i] = num;    
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty!!\n");
            return;
        }
        System.out.println("Popped element is: " + arr[top] + "\n");
        top--;
    }

    void peek()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty!!\n");
            return;
        }
        System.out.println("Topmost Element of stack is: " + arr[top] + "\n");
    }

    void display(int n)
    {
        if(top == -1)
        {
            System.out.println("Stack Empty!!\n");
            return;
        }
        System.out.println("Stack elements are: ");
        for(int i = top; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("\n");
    }
}

public class SimpleStack {
    public static void main(String[] args)
    {
        byte choice = 0; 
        int n = 0;
        Scanner grasp = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        n = grasp.nextInt();
        stack stack1 = new stack(n);
        // stack stack1 = new stack();
        do
        {
            System.out.println("1 -->Push elements into stack\n2 -->Pop elements from stack\n3 -->Peek into Stack\n4 -->Display stack elements\n0 -->Exit");
            System.out.println("Enter choice: ");
            choice = grasp.nextByte();

            switch(choice)
            {
                case 0:
                {
                    break;
                }
                case 1:
                {
                    stack1.push(n);
                    break;
                }

                case 2:
                {
                    stack1.pop();
                    break;
                }
                
                case 3:
                {
                    stack1.peek();
                    break;
                }

                case 4:
                {
                    stack1.display(n);
                    break;
                }

                default:
                {
                    System.out.println("Invalid choice!!");
                }
            }
        }while(choice != 0);
    }
}
