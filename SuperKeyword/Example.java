package SuperKeyword;


class a{
    int a;
    void disp()
    {

    }
}
class b extends a{
    int b;
    void disp()
    {
        super.disp();
    }
    void print()
    {
        int a;
        this.a=10;//Child class variable
        super.a=30;// parent class variable
    }
}
public class Example
{
    public static void main(String[] args) {
        b b1=new b();
      b1.disp();
    }
}
