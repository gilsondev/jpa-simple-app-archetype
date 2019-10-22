package $package;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAPractice");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Use yours entities here

        entityManager.close();
        entityManagerFactory.close();

    }
}
