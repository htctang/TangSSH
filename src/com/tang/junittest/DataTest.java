package com.tang.junittest;

import com.tang.entity.UserTb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by 唐川htc on 2016/5/23.
 */
public class DataTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        UserTb userTb = new UserTb();
        userTb.setPassword("12222");
        userTb.setName("qwe");
        session.save(userTb);
        session.beginTransaction().commit();

    }
}
