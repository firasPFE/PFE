package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fichiers implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Id_Fichier;
	private String Nom_Fichier;
	private String Type;
	private Date date;
	

	public Fichiers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId_Fichier() {
		return Id_Fichier;
	}

	public void setId_Fichier(String id_Fichier) {
		Id_Fichier = id_Fichier;
	}

	public String getNom_Fichier() {
		return Nom_Fichier;
	}

	public void setNom_Fichier(String nom_Fichier) {
		Nom_Fichier = nom_Fichier;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}


	public Fichiers(String id_Fichier, String nom_Fichier, String type,
			Date date) {
		super();
		Id_Fichier = id_Fichier;
		Nom_Fichier = nom_Fichier;
		Type = type;
		this.date = date;
	}
	
	
	
}
