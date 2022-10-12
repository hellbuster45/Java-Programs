public class LeapYearCheck 
{
    public static void main(String[] args)
    {
        //short year = Short.parseShort(args[0]);
        short year = 2019;
        boolean yearcheck = ((year % 4 == 0) && (year % 100 != 0)) ? true : false; 
        //System.out.println(yearcheck);
        System.out.println(year + " is a leap year: " + yearcheck);
    }    
}
