package com.rds.click;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Gadi
 */
public class DatabaseConnection {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);
    private static final DatabaseConnection instance = new DatabaseConnection();
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("w6admin");

    private DatabaseConnection() {
        logger.info("Start new DB connection...");
    }

    public static DatabaseConnection getInstance() {
        return instance;
    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public boolean persist(Object object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            logger.error("Failed to persist object: [{}]" , object.getClass(), e);
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }

}
