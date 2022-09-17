/** 
 1* grasp.nextLine is written explicitely to flush the Input Buffer(Input buffer stores the inputs made from the keyboard...);

 2* With this program, you can enter your subjects and marks, and calculate average and percentage of your marks based on your given input....

 3* The resource leak warning isn't resolved on purpose...
*/

import java.util.Scanner;

class Marks {
    // Marks(byte num, int[] mrks, String[] subs)
    static void enter_details(byte num, int[] mrks, String[] subs) {
        Scanner grasp = new Scanner(System.in);
        for (byte i = 0; i < num; i++) {
            switch (i) {
                case 0: {
                    System.out.println("Enter name and marks of " + (i + 1) + "st subject respectively: ");
                    // grasp.nextLine();
                    subs[i] = grasp.nextLine();
                    mrks[i] = grasp.nextInt();
                    break;
                }

                case 1: {
                    System.out.println("Enter name and marks of " + (i + 1) + "nd subject respectively: ");
                    grasp.nextLine();
                    subs[i] = grasp.nextLine();
                    mrks[i] = grasp.nextInt();
                    break;
                }

                case 2: {
                    System.out.println("Enter name and marks of " + (i + 1) + "rd subject respectively: ");
                    grasp.nextLine();
                    subs[i] = grasp.nextLine();
                    mrks[i] = grasp.nextInt();
                    break;
                }

                default: {
                    break;
                }
            }
            if (i > 2) {
                System.out.println("Enter name and marks of " + (i + 1) + "th subject respectively: ");
                grasp.nextLine();
                subs[i] = grasp.nextLine();
                mrks[i] = grasp.nextInt();
            }
        }

        System.out.printf("\n\nMarks and names of %d subjects entered successfully!!\n\n", num);
    }

    static void printRecord(String name1, int mrk[], String[] sub, byte n) {
        System.out.println("\t\tSubject\t\tMarks");
        for (int i = 0; i < n; i++) {
            System.out.println("\t\t" + sub[i] + "\t\t" + mrk[i]);
        }
    }

    static void calcavg(int mrk[], byte n) {
        float total = 0F;
        for (int i = 0; i < n; i++) {
            total += mrk[i];
        }
        System.out.println("Average of your marks is: " + (total / n) + "\n\n");
    }

    static void calcperc(int mrk[], byte n) 
    {
        float total = 0F;
        for (int i = 0; i < n; i++) {
            total += mrk[i];
        }

        System.out.println("Percentage of your marks is: " + ((total / (100 * n)) * 100) + "\n\n");
    }

    static byte continuecheck()
    {
        byte ch;
        System.out.println("Would you like to continue?? (Press 1 to continue OR Press 0 to exit): ");
        Scanner grasp = new Scanner(System.in);
        ch = grasp.nextByte();
        return ch;
    }
}

public class Marks_Calculator {
    public static void main(String[] args) {
        Scanner grasp = new Scanner(System.in);
        String a;
        byte choice = 2, num;
        int[] marks;
        String[] subjects;
        System.out.println("\n***************************Marks And Subjects Record***************************\n");
        do {
            exit:
            {
                System.out.println("Enter your name: ");
                a = grasp.nextLine();
                System.out.println("Enter number of subjects: ");
                num = grasp.nextByte();

                marks = new int[num];
                subjects = new String[num];
                Marks.enter_details(num, marks, subjects);
            

                while(choice != 0)
                {
                    System.out.println("-----> Press 1 to print the record\n-----> Press 2 to calculate average of your marks\n-----> Press 3 to calculate your percentage\n-----> Press 0 to exit\n");
                    choice = grasp.nextByte();
                    switch (choice) 
                    {
                        case 1: 
                        {
                            Marks.printRecord(a, marks, subjects, num);
                            choice = Marks.continuecheck();
                            if(choice == 0)
                            {
                                break exit;
                            }
                            else
                            {
                                grasp.nextLine();
                                break;
                            }
                        }

                        case 2: 
                        {
                            Marks.calcavg(marks, num);
                            choice = Marks.continuecheck();
                            if(choice == 0)
                            {
                                break exit;
                            }
                            else
                            {
                                grasp.nextLine();
                                break;
                            }
                        }

                        case 3: 
                        {
                            Marks.calcperc(marks, num);
                            choice = Marks.continuecheck();
                            if(choice == 0)
                            {
                                break exit;
                            }
                            else
                            {
                                grasp.nextLine();
                                break;
                            }
                        }

                        case 0: 
                        {
                            break;
                        }

                        default: {
                            System.out.println("Invalid choice!!!");
                        }
                    }
                }
            }
        }while(choice != 0);

        System.out.println("\n\nYou have exited the program!!\n\n");
    }
}
