import java.util.Scanner;

class time
{
    int hours, minutes, seconds;

    time()
    {
        this(3, 00, 00);
        /*Scanner grasp = new Scanner(System.in);
        System.out.println("Enter hours, minutes and seconds: ");
        int hr = grasp.nextInt();
        int min = grasp.nextInt();
        int sec = grasp.nextInt();*/
    }

    time(int hr, int min, int sec)
    {
        hours = hr;
        minutes = min;
        seconds = sec;
    }

    void addTime(int sec)
    {
        this.seconds += (sec % 60);
        this.minutes += ((sec / 60) % 60);
        this.hours +=  ((sec / 60) / 60);
    }

    void converter(int sec)
    {
        System.out.println("\nEntered seconds converted into hours, minutes and seconds:\n\tHH:MM:SS --> " + ((sec / 60) / 60) + ":" + ((sec / 60) % 60) + ":" + (sec % 60) + "\n");        
    }

    void displayTime()
    {
        System.out.println(("\tHH:MM:SS --> " + hours + ":" + minutes + ":" + seconds));
    }
}
public class TimeClass 
{
    public static void main(String[] args)
    {
        int sec;
        Scanner grasp = new Scanner(System.in);
        
        System.out.println("Enter time in seconds: ");
        sec = grasp.nextInt();
        
        time obj = new time();
        System.out.println("Default time: ");
        obj.displayTime();
        obj.converter(sec);
        System.out.println("Time after addition is: ");
        obj.addTime(sec);
        obj.displayTime();
        grasp.close();
    }
}
