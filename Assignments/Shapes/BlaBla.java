package Shapes;

import java.util.Scanner;

class Circle extends Shapes implements Computation
{
    Circle()
    {
        this(69.0F);
    }

    Circle(Float radius)
    {
        this.radius = radius;
    }

    public void Area()
    {
        System.out.println("Area of circle is: " + (PI * radius * radius));
    }
    
    public void Peri()
    {
        System.out.println("Perimeter(Circumference) of circle is: " + (PI * radius * 2));
    }

    public void Vol()
    {
        System.out.println("Volume of circle not available");
    }
}


class Rect extends Shapes implements Computation
{
    Rect()
    {
        this(69.0F, 420.0F);
    }

    Rect(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void Area()
    {
        System.out.println("Area of Rectangle is: " + (this.length * this.breadth));
    }

    public void Peri()
    {
        System.out.println("Perimeter of Rectanlge is: " + (this.length + this.breadth));
    }

    public void Vol()
    {
        System.out.println("Volume of Rectangle not available");
    }

}


class Parellelopiped extends Shapes implements Computation
{
    Parellelopiped()
    {
        this(69.0F, 420.0F, 96.0F);
    }

    Parellelopiped(float length, float breadth, float height)
    {
        this.length= length;
        this.breadth = breadth;
        this.height = height;
    }

    public void Area()
    {
        System.out.println("Area of Parellelopiped is: " + (this.length * this.breadth * this.height));
    }

    public void Vol()
    {
        System.out.println("Volume of Parellelopiped is: " + (2 * (this.length * this.breadth + this.breadth * this.height + this.height * this.length)));
    }

    public void Peri()
    {
        System.out.println("Perimeter of Parellelopiped not available!!");
    }
}


class sphere extends Shapes implements Computation
{
    sphere()
    {
        this(69.0F);
    }

    sphere(float radius)
    {
        this.radius = radius;
    }

    public void Area()
    {
        System.out.println("Area of sphere is: " + (4 * PI * this.radius * this.radius));
    }

    public void Vol()
    {
        System.out.println("Volume of sphere is: " + ((4 * PI * this.radius * this.radius * this.radius) / 3));
    }

    public void Peri()
    {
        System.out.println("Perimeter of sphere not available!!");
    }
}


public class BlaBla {
    public static void main(String[] args) 
    {
        float l, b, h ,r;
        Scanner grasp = new Scanner(System.in);
        
        System.out.println("Enter radius for circle: ");
        r = grasp.nextFloat();
        System.out.println("enter length: ");
        l = grasp.nextFloat();
        System.out.println("enter breadth: ");
        b = grasp.nextFloat();
        System.out.println("enter height: ");
        h = grasp.nextFloat();

        Circle cir1 = new Circle(r);
        sphere sph = new sphere(r);
        Parellelopiped p1 = new Parellelopiped(l, b, h);
        Rect r1 = new Rect(l, b);

        System.out.println("\n");
        cir1.Area();
        cir1.Peri();
        cir1.Vol();
        
        System.out.println("\n");
        sph.Area();
        sph.Peri();
        sph.Vol();
        
        System.out.println("\n");
        p1.Area();
        p1.Peri();
        p1.Vol();
        
        System.out.println("\n");
        r1.Area();
        r1.Peri();
        r1.Vol();
    }
}
