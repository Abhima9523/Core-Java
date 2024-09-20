package MethodOverLodingAndOverriding;

class A{

}
class B extends A{
    public void display()
    {
        System.out.println("class 1");
    }
    public void  display(int k)
    {
        System.out.println("class 2");
    }
    public void display(int a,int c)
    {
        System.out.println("class 3");
    }
}
public class loding
{
    public static void main(String[] args) {
        B b= new B();
        b.display();
        b.display(1);
        b.display(1,2);
    }
}
