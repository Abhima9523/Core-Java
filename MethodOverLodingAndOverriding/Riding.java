package MethodOverLodingAndOverriding;

class C{
    public void disp()
    {
        System.out.println("class C");
    }
}
class D{
    public void disp()
    {
        System.out.println("class D");
    }
}
public class Riding
{
    public static void main(String[] args) {
        D d=new D();
        d.disp();
        C c=new C();
        c.disp();
    }
}
