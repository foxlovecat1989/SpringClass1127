package jpa.single;

import com.mycompany.SpringBasic1127.jpa.entities.Customer;
import org.junit.Test;
import jpa.JPATemplate;

public class Create extends JPATemplate{
    @Test
    public void create(){
        // 進行資料表交易程序...
        // CRUD
        Customer customer = new Customer();
        customer.setLastName("Amy");
        // 新增 customer 物件資料到 CUSTOMER 資料表中建立一筆紀錄
        session.persist(customer);
    }
}
