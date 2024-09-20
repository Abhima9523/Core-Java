package initializationBlock;

public class Example2
{
    static int x;
    static {
        System.out.println("static initilazation block :"+x);
        x=10;
    }
    Example2()
    {
        System.out.println("x :"+x);
    }

    public static void main(String[] args) {
        Example2 x=new Example2();
    }
}
