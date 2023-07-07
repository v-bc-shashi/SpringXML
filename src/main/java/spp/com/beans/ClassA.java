package spp.com.beans;

public class ClassA {
    private String name;
    private int ssn;
    private double salary;

    private ClassB myBObject;

    public ClassA() {
        System.out.println("I am ClassA constructor !!");
    }

    public ClassA(ClassB argBObject) {
        System.out.println("I am ClassA constructor !!");
        myBObject= argBObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am setName");
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        System.out.println("I am setSsn"); this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ClassB getMyBObject() {
        return myBObject;
    }

    public void setMyBObject(spp.com.beans.ClassB myBObject) {
        this.myBObject = myBObject;
    }
}
