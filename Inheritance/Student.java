package Inheritance;

public class Student  extends Person
{
    private int roll;
    private String branch;
    private String college;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void details()
    {
        System.out.println("name :"+getName());
        System.out.println("age :"+getAge());
        System.out.println("sex :"+getSex());
        System.out.println("roll :"+getRoll());
        System.out.println("branch :"+getBranch());
        System.out.println("college :"+getCollege());

    }
}
