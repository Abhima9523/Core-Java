package Contructor;

public class Constructor
{
    int id;
    String name;
            public Constructor(int id, String name)
            {
                this.name=name;
                this.id=id;

            }
            public void disp()
            {
                System.out.println("Id :"+id);
                System.out.println("name :"+name);
            }

    public static void main(String[] args) {
        Constructor c= new Constructor(1,"abhimanyu");
        c.disp();
    }
}
