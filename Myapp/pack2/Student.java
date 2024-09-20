package Myapp.pack2;

public class Student
{
    private int id;
    private String name;
    private int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void disp()
    {
        System.out.println("Student id :"+id);
        System.out.println("Student name:"+name);
        System.out.println("Student roll no :"+roll);
    }

}
