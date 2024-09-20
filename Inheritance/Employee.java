package Inheritance;

public class Employee extends Person
{
     private double salary;
     private double exp;

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", salary=" + salary +
                '}';
    }
}
