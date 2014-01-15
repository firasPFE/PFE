package Services;

import javax.ejb.Local;

import persistance.Profil;

@Local
public interface ProfilLocal {

	
	
	boolean initDB();
	Profil CreateProfil(Profil profil);
}
