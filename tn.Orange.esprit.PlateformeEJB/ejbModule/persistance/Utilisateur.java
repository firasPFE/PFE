package persistance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;





@Entity
public class Utilisateur  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Calling_Station_Id;
	private int IMSI;
	private int IMEI_sv;
	private String User_name;
	private String Framed_ip_address;
	
	private static final long serialVersionUID = 1L;
	@ManyToMany(mappedBy = "utilisateurs")
	private List<Profil> profils;
	

	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getCalling_Station_Id() {
		return Calling_Station_Id;
	}
	public void setCalling_Station_Id(String calling_Station_Id) {
		Calling_Station_Id = calling_Station_Id;
	}
	public int getIMSI() {
		return IMSI;
	}
	public void setIMSI(int iMSI) {
		IMSI = iMSI;
	}
	public int getIMEI_sv() {
		return IMEI_sv;
	}
	public void setIMEI_sv(int iMEI_sv) {
		IMEI_sv = iMEI_sv;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getFramed_ip_address() {
		return Framed_ip_address;
	}
	public void setFramed_ip_address(String framed_ip_address) {
		Framed_ip_address = framed_ip_address;
	}


	public Utilisateur(String calling_Station_Id, int iMSI, int iMEI_sv,
			String user_name, String framed_ip_address) {
		super();
		Calling_Station_Id = calling_Station_Id;
		IMSI = iMSI;
		IMEI_sv = iMEI_sv;
		User_name = user_name;
		Framed_ip_address = framed_ip_address;
	}
	
	
	
	
}
