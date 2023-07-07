package spp.com.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/* Note : The Use of InitializingBean, DisposableBean is not recomended */
public class ClassPLifeCycle implements InitializingBean, DisposableBean {

    private String myclassName;

    public void setMyclassName(String myclassName) {
        System.out.println("I am setMyclassName for  ClassPLifeCycle");
        this.myclassName = myclassName;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am After propertySet Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I have Distroyed Now.");
    }
}
