package Services;

import javax.ejb.Remote;

@Remote
public interface FichierServiceRemote {

	
	boolean initDB();
}
