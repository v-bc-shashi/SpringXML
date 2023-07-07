package spp.com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spp.com.beans.ClassA;
import spp.com.beans.ClassB;
import spp.com.beans.ClassC;
import spp.com.beans.ClassPLifeCycle;

/**
 * Hello world!
 *
 */public class App

{
    public static void main( String[] args )
    {
        System.out.println( "......................." );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
      //ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");  /***This is required when we are using the Interface for bean life cycle ****/
     /*Note : Destroy method will call only if we ill us  ConfigurableApplicationContext ctx
     *because it have  Registering the Shutdown Hook so we can call CLOSE();
     * It wll not call if we will use ApplicationContext, Because It does not have close method.
     * */


        // ClassA myObj= (ClassA) ctx.getBean("classA");
       // ClassC myObjc= (ClassC) ctx.getBean("classC");
      //  ClassB myObjd= (ClassB) ctx.getBean("classB");

     //   ClassPLifeCycle myObj= (ClassPLifeCycle) ctx.getBean("classP");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        /*System.out.println("Name : "+ myObj.getName());
        System.out.println("SSN :"+ myObj.getSsn());
        System.out.println("Salary : "+ myObj.getSalary());
        System.out.println("Object B From A : "+ myObj.getMyBObject().getClassName());*/
      //  ctx.close();
        System.out.println( "........ DONE ........." );
    }
}
