package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Localisation implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String SGSN_Address;
	private String User_Location_Info;
	private int Ms_Timezone;
	
	
	
	public Localisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSGSN_Address() {
		return SGSN_Address;
	}
	public void setSGSN_Address(String sGSN_Address) {
		SGSN_Address = sGSN_Address;
	}
	public String getUser_Location_Info() {
		return User_Location_Info;
	}
	public void setUser_Location_Info(String user_Location_Info) {
		User_Location_Info = user_Location_Info;
	}
	public int getMs_Timezone() {
		return Ms_Timezone;
	}
	public void setMs_Timezone(int ms_Timezone) {
		Ms_Timezone = ms_Timezone;
	}
	
	public Localisation(String sGSN_Address, String user_Location_Info,
			int ms_Timezone) {
		super();
		SGSN_Address = sGSN_Address;
		User_Location_Info = user_Location_Info;
		Ms_Timezone = ms_Timezone;
	}
	
	
	
}
