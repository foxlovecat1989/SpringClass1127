package jpa.single;

import com.mycompany.SpringBasic1127.jpa.entities.Customer;
import jpa.JPATemplate;
import org.hibernate.Query;
import org.junit.Test;

public class Update extends JPATemplate {
    @Test
    public void t1() {
        
//        // 1. 永續物件修改
//        Customer c1 = (Customer)session.get(Customer.class, 1);
//        c1.setLastName("AAA");
        
        // 2. 新創物件修改
        Customer c2 = new Customer();
        c2.setId(2);
        c2.setLastName("BBB");
        session.update(c2); // 若未加此行, 不會修改 -> 因為是"新創物件"
        
//        // 3. 下達 SQL 修改
//        String sql = "UPDATE Customer set last_name = :lastName WHERE id = :id";
//        Query query = session.createQuery(sql);
//        // Query query = session.createSQLQuery(sql); 
//        // 不知道是用哪個?  createQuery(sql) or .createSQLQuery(sql)
//        query.setParameter("lastName", "CCC");
//        query.setParameter("id", 3);
//        int updateRowCount = query.executeUpdate(); // 回傳一個異動筆數
//        System.out.println("updateRowCount = " + updateRowCount);
    }
}
