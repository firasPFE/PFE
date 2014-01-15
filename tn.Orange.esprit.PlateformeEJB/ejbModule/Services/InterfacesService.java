package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class InterfacesService
 */
@Stateless
@LocalBean
public class InterfacesService implements InterfacesServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;
    public InterfacesService() {
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
