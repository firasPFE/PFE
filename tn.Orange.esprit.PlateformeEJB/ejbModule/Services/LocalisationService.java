package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class LocalisationService
 */
@Stateless
@LocalBean
public class LocalisationService implements LocalisationServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;
    public LocalisationService() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public boolean initDB() {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			persistance.Localisation localisation = new persistance.Localisation();
			entityManager.persist(localisation);

			b = true;
		}
		 catch (Exception e) {
				System.err.println("oops ...");
			}
			return b;
	}

    
}
