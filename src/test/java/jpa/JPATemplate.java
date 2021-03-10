package jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JPATemplate {
    
    private ClassPathXmlApplicationContext ctx;
    protected Session session;
    private Transaction transaction;
    private SessionFactory sessionFactory;
    
    @Before
    public void before(){
        ctx = new ClassPathXmlApplicationContext("jpa-config.xml");
        // 取得連線工廠
        sessionFactory = ctx.getBean("sessionFactory", SessionFactory.class);
        // 取得連線物件
        session = sessionFactory.getCurrentSession();
        // 取得交易管理並開始
        transaction = session.beginTransaction();
    } 
    
    @After
    public void after(){
        transaction.commit();   // 提交
        sessionFactory.close(); // 關閉
        ctx.close();
    }
}
