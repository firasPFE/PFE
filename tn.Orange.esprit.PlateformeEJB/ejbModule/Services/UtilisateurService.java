package Services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;




/**
 * Session Bean implementation class Utilisateur
 */
@Stateless
public class UtilisateurService implements UtilisateurRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;

    public UtilisateurService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean initDB() {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			persistance.Utilisateur utilisateur = new persistance.Utilisateur();
			entityManager.persist(utilisateur);

			b = true;
		}
		 catch (Exception e) {
				System.err.println("oops ...");
			}
			return b;
	}

	@Override
	public persistance.Utilisateur createUtilisateur(
			persistance.Utilisateur utilisateur) {
		
		entityManager.persist(utilisateur);
		return utilisateur;
	}

    
}
