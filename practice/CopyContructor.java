
class Copy
{
    private float price;
    private String name;
    //private final int total_marks;
    Copy()
    {
        price = 69;
        name = "lol";
        //total_marks = 100;
    }

    Copy(Copy copy)
    {
        this.price = copy.price;
        this.name = copy.name;
        //total_marks = 100;
    }

    Float getPrice()
    {
        return this.price;
    }

    String getName()
    {
        return this.name;
    }

}

public class CopyContructor 
{
    public static void main(String[] args)
    {
        Copy obj = new Copy();
        Copy copy1 = new Copy(obj);
        System.out.println("First object's variables: " + obj.getName() + " " + obj.getPrice());
        System.out.println("First object's copy's variables: " + copy1.getName() + " " + copy1.getPrice());
    }
}
