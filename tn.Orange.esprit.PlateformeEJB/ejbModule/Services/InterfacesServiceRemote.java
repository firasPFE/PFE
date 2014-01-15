package Services;

import javax.ejb.Remote;

@Remote
public interface InterfacesServiceRemote {

	boolean initDB();
}
