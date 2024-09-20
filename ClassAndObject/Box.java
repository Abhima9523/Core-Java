package ClassAndObject;

public class Box
{
    private int length,breadth,height;

    public void SetDimension(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void ShowDimension()
    {
        System.out.println("Length :"+length);
        System.out.println("breadth :"+breadth);
        System.out.println("height :"+height);
    }

    public static void main(String[] args) {
        Box b=new Box();
        b.SetDimension(10,20,30);
        b.ShowDimension();
    }
}
