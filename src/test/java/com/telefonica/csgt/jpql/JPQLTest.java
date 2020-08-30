package com.telefonica.csgt.jpql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.eclipse.persistence.internal.jpa.EJBQueryImpl;
import org.eclipse.persistence.jpa.JpaEntityManager;
import org.eclipse.persistence.queries.DatabaseQuery;
import org.eclipse.persistence.sessions.DatabaseRecord;
import org.eclipse.persistence.sessions.Session;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationTestContextIT.xml")
public class JPQLTest {

    @PersistenceContext
    private EntityManager em;


    @Transactional
    @Test
    public void testJPQL() {
        for (int i = 0; i < 2; i++) {
            Query querys = em.createNamedQuery("query" + i);

            switch (i){
                case 0:
                    querys.setParameter("idNotificationRole", 1);
                    break;
                case 1:
                    querys.setParameter("conditionWf", 1);
                    querys.setParameter("guardCondition", 1);
                    break;

            }
            int results = querys.getFirstResult();
            Assert.assertEquals(0, results);
            System.out.println("LA QUERY RESULTANTE ES: " + getSql(querys));
        }
    }

    private String getSql(Query query) {
        Session session = em.unwrap(JpaEntityManager.class).getActiveSession();
        DatabaseQuery databaseQuery = ((EJBQueryImpl) query).getDatabaseQuery();
        databaseQuery.prepareCall(session, new DatabaseRecord());
        String sqlString = databaseQuery.getSQLString();
        return sqlString;
    }

}
