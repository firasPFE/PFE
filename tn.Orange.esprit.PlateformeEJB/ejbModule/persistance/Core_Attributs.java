package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Core_Attributs implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Nas_Identifier;
	private String Nas_Ip_Address;
	private String Nas_Port_Type;
	private int Nas_Port;
	
	
	
	public Core_Attributs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNas_Identifier() {
		return Nas_Identifier;
	}
	public void setNas_Identifier(String nas_Identifier) {
		Nas_Identifier = nas_Identifier;
	}
	public String getNas_Ip_Address() {
		return Nas_Ip_Address;
	}
	public void setNas_Ip_Address(String nas_Ip_Address) {
		Nas_Ip_Address = nas_Ip_Address;
	}
	public String getNas_Port_Type() {
		return Nas_Port_Type;
	}
	public void setNas_Port_Type(String nas_Port_Type) {
		Nas_Port_Type = nas_Port_Type;
	}
	public int getNas_Port() {
		return Nas_Port;
	}
	public void setNas_Port(int nas_Port) {
		Nas_Port = nas_Port;
	}
	public Core_Attributs(String nas_Identifier, String nas_Ip_Address,
			String nas_Port_Type, int nas_Port) {
		super();
		Nas_Identifier = nas_Identifier;
		Nas_Ip_Address = nas_Ip_Address;
		Nas_Port_Type = nas_Port_Type;
		Nas_Port = nas_Port;
	}
	
	
	
}
