package spp.com.beans;

public class ClassB {

    private String className;

    private ClassC myCObject;
    public ClassB(String className) {

        System.out.println("I am ARG Constructor of ClassB with Value : " + className );
        this.className = className;
    }
    public ClassB() {
        System.out.println("I am NO ARG Constructor of ClassB :");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}





