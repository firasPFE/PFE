package Services;

import javax.ejb.Remote;

@Remote
public interface Core_AttributsServiceRemote {

	public boolean initDB();
}
