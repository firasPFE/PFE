package persistance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Profil implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Called_station_id;
	private String charging_charatcterstics;
	private String SGSN_address;
	private String SGSN_MCC_MNC;
	
	@ManyToMany
	private List<Utilisateur> utilisateurs;
	
	
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCalled_station_id() {
		return Called_station_id;
	}
	public void setCalled_station_id(String called_station_id) {
		Called_station_id = called_station_id;
	}
	public String getCharging_charatcterstics() {
		return charging_charatcterstics;
	}
	public void setCharging_charatcterstics(String charging_charatcterstics) {
		this.charging_charatcterstics = charging_charatcterstics;
	}
	public String getSGSN_address() {
		return SGSN_address;
	}
	public void setSGSN_address(String sGSN_address) {
		SGSN_address = sGSN_address;
	}
	public String getSGSN_MCC_MNC() {
		return SGSN_MCC_MNC;
	}
	public void setSGSN_MCC_MNC(String sGSN_MCC_MNC) {
		SGSN_MCC_MNC = sGSN_MCC_MNC;
	}
	public Profil(String called_station_id, String charging_charatcterstics,
			String sGSN_address, String sGSN_MCC_MNC) {
		super();
		Called_station_id = called_station_id;
		this.charging_charatcterstics = charging_charatcterstics;
		SGSN_address = sGSN_address;
		SGSN_MCC_MNC = sGSN_MCC_MNC;
	}
	

	
	
}
