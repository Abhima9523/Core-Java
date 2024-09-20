package StaticAndNonstatic;

 class Demo {
     int a;
     static int b;

     public void disp(int a) {
         System.out.println("non static varable");
     }

     public static void disp1(int b) {
         System.out.println("static variable");
     }
 }
    public class Demo1{
        public static void main(String[] args) {
            Demo d=new Demo();
            d.disp(20);
           Demo.disp1(10);
        }
    }

