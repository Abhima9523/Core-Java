package initializationBlock;

public class Example {
    int x;
    {
        System.out.println(" instance initilazation block :"+x);
        x=5;
    }
    Example()
    {
        System.out.println("updated x=:"+x);
    }

    public static void main(String[] args) {
        Example x=new Example();
    }
}
