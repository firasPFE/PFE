package Services;

import javax.ejb.Remote;

import persistance.Profil;

@Remote
public interface ProfilRemote {

	boolean initDB();

	Profil CreateProfil(Profil profil);
}
