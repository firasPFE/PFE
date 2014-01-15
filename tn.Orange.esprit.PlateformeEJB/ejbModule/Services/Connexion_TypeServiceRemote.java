package Services;

import javax.ejb.Remote;

@Remote
public interface Connexion_TypeServiceRemote {

	
	boolean initDB();
	
}
