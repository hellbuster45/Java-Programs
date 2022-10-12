import java.util.Scanner;

class cir
{
        float rad;
        static final float PIE = 3.14F;

        float getcircum()
        {                
            return 2 * PIE * rad;
        }

        float getarea()
        {
            return PIE * rad * rad;
        }

        cir()
        {
            rad = 0.0f;
        }

        cir(float a)
        {
            rad = a;            
        }

        void getradius()
        {
            Scanner grasp = new Scanner(System.in);
            System.out.println("Enter radius of circle: ");
            rad = grasp.nextFloat();
            grasp.close();
        }
}

public class Circle
{
        public static void main(String[] args)
        {
                cir c1 = new cir();
                c1.getradius();
                byte choice = 0;
                Scanner grasp = new Scanner(System.in);
                do
                {
                        System.out.println("---->Press 1 to caclulate area of circle\n---->Press 2 to calculate circumference\n---->Press 0 to exit");
                        System.out.println("Enter your choice: ");
                        choice = grasp.nextByte();

                        switch(choice)
                        {
                                case 1:
                                {        
                                        System.out.println("Area of circle is: \n\n" + c1.getarea());
                                        break;
                                }
				                
                                case 2:
                                {
                                        System.out.println("Circumference of circle: \n\n" + c1.getcircum());
                                        break;
                                }

                                case 0:
                                {
                                        break;
                                }

                                default:
                                {
                                        System.out.println("Invalid Choice!!!\n\n");
                                }
                        }
                }while(choice != 0);
                System.out.println("You,ve exited the program!!");
                grasp.close();
        }
}
