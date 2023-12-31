package sit.int202.assignment1.Repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.assignment1.Entities.Environment;

public class EntityManagerBuilder {
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory(Environment.UNIT_NAME);

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
