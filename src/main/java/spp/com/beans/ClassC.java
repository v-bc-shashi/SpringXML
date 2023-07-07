package spp.com.beans;

public class ClassC {
    private String className;


    public ClassC() {
        System.out.println("This is  ClassC Constructor");
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
