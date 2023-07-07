package spp.com.beans;

public class ClassRLIfeCycleWithotoutInterface {
    private String myClassName;


    public  ClassRLIfeCycleWithotoutInterface(){
        System.out.println("I got called");
    }
    public void setMyClassName(String myClassName) {
        this.myClassName = myClassName;
    }

    public void initBean(){
        System.out.println("I am initializing");
    }

    public void detroybean(){
        System.out.println("I am going to Destroy the Beam");
    }
}
