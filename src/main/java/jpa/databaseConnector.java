package jpa;

import entity.UserSkema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class databaseConnector {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu", null);
    
    private EntityManager getManager() {
        return emf.createEntityManager();
    }
    
    public void saveSkema(String jsonString, String username) {
        UserSkema us = new UserSkema(jsonString, username, new Date());
        EntityManager em = getManager();
        try {
            em.getTransaction().begin();
            em.persist(us);
            em.getTransaction().commit();
        } catch(Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public UserSkema findUserSkema(String username){
        EntityManager em = getManager();
        List<UserSkema> usList = new ArrayList();
        try {
            Query q1 = em.createQuery("SELECT u FROM UserSkema u WHERE u.username =" + username);
            usList = q1.getResultList();
        } catch(Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usList.get(0);
    }
}
