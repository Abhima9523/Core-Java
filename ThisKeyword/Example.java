package ThisKeyword;

public class Example
{
    private int a,b,c;
    public void disp(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void add()
    {
        System.out.println("Add :"+(a+b+c));
    }
    public static void main(String[] args) {
        Example e=new Example();
        e.disp(1,2,3);
        e.add();
    }
}
