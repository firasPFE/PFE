package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Connexion_TypeService
 */
@Stateless
@LocalBean
public class Connexion_TypeService implements Connexion_TypeServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;
    public Connexion_TypeService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean initDB() {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			persistance.Connexion_Type connexion_Type = new persistance.Connexion_Type();
			entityManager.persist(connexion_Type);

			b = true;
		}
		 catch (Exception e) {
				System.err.println("oops ...");
			}
			return b;
	}

}
