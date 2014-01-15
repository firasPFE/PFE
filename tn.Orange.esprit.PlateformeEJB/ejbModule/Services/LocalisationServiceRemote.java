package Services;

import javax.ejb.Remote;

@Remote
public interface LocalisationServiceRemote {

	
	boolean initDB();
}
