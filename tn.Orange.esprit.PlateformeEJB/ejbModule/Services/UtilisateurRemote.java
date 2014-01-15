package Services;

import javax.ejb.Remote;

import persistance.Utilisateur;

@Remote
public interface UtilisateurRemote {

	
	boolean initDB();
	Utilisateur createUtilisateur (Utilisateur utilisateur);
}
