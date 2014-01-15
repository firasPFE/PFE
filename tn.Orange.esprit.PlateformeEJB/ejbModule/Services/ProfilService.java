package Services;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * Session Bean implementation class Profil
 */
@Stateless

public class ProfilService implements ProfilRemote, ProfilLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;
    public ProfilService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean initDB() {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			persistance.Profil profil = new persistance.Profil();
			entityManager.persist(profil);

			b = true;
		}
		 catch (Exception e) {
				System.err.println("oops ...");
			}
			return b;
	}

	@Override
	public persistance.Profil CreateProfil(persistance.Profil profil) {
		// TODO Auto-generated method stub
		entityManager.persist(profil);
		return profil;
	}

}
