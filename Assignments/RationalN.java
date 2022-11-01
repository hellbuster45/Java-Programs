import java.util.Scanner;

class Ration
{
    private float numerator;
    private float denominator;

    Ration()
    {
        this(2, 3);
    }

    Ration(float numerator, float denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Ration(Ration c)
    {
        this.numerator = c.denominator;
        this.denominator = c.numerator;
    }

    void multiply(Ration c)
    {
        System.out.println("Multiplication is: " + (this.numerator * c.numerator) + "/" + (this.denominator * c.denominator));
    }

    void divide(Ration c)
    {
        System.out.println("Division is: " + (this.numerator * c.numerator) + "/" + (this.denominator * c.denominator));
    }
}

public class RationalN 
{
    public static void main(String[] args) 
    {
        Scanner grasp = new Scanner(System.in);
        Float n, d;
        
        System.out.println("Enter numerator for first Fraction: ");
        n = grasp.nextFloat();
        System.out.println("Enter denominator for first Fraction: ");
        d = grasp.nextFloat();
        Ration obj = new Ration(n, d);
        
        System.out.println("Enter numerator for second Fraction: ");
        n = grasp.nextFloat();
        System.out.println("Enter denominator for second Fraction: ");
        d = grasp.nextFloat();
        Ration obj2 = new Ration(n, d);

        obj.multiply(obj2);

        Ration Cobj = new Ration(obj2);

        Cobj.divide(obj);
    }
}
