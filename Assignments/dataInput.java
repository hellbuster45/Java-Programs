
import java.util.Scanner;

public class dataInput {
    public static void main(String[] args) {
        byte bt;
        short sh;
        int i;
        long l;
        String st = new String();
        float f;
        double d;
        char c;
        boolean bo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Byte");
        bt = scan.nextByte();
        System.out.println(bt);
        
        System.out.println("Enter a Short");
        sh = scan.nextShort();
        System.out.println(sh);
        
        System.out.println("Enter a Integer");
        i = scan.nextInt();
        System.out.println(i);
        
        System.out.println("Enter a Long");
        l = scan.nextLong();
        System.out.println(l);
        
        System.out.println("Enter a Float");
        f = scan.nextFloat();
        System.out.println(f);
        
        System.out.println("Enter a Double");
        d = scan.nextDouble();
        System.out.println(d);
        
        System.out.println("Enter a Boolean");
        bo = scan.nextBoolean();
        System.out.println(bo);
       
        System.out.println("Enter a str");
        st = scan.nextLine();
        System.out.println(st);
        
        System.out.println("Enter a character");
        c = st.charAt(0);
        System.out.println(c);
        
        scan.close();
    }
}






