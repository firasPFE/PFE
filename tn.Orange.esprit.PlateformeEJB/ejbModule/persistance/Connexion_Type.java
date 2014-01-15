package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Connexion_Type implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id_Conn;
	private String Service_Type;
	private String Framed_Protocol;
	private String Rat_Type;
	private String Negotiated_dscp;
	private String Pdp_Type;
	
	
	
	
	public Connexion_Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_Conn() {
		return Id_Conn;
	}
	public void setId_Conn(int id_Conn) {
		Id_Conn = id_Conn;
	}
	public String getService_Type() {
		return Service_Type;
	}
	public void setService_Type(String service_Type) {
		Service_Type = service_Type;
	}
	public String getFramed_Protocol() {
		return Framed_Protocol;
	}
	public void setFramed_Protocol(String framed_Protocol) {
		Framed_Protocol = framed_Protocol;
	}
	public String getRat_Type() {
		return Rat_Type;
	}
	public void setRat_Type(String rat_Type) {
		Rat_Type = rat_Type;
	}
	public String getNegotiated_dscp() {
		return Negotiated_dscp;
	}
	public void setNegotiated_dscp(String negotiated_dscp) {
		Negotiated_dscp = negotiated_dscp;
	}
	public String getPdp_Type() {
		return Pdp_Type;
	}
	public void setPdp_Type(String pdp_Type) {
		Pdp_Type = pdp_Type;
	}
	public Connexion_Type(int id_Conn, String service_Type,
			String framed_Protocol, String rat_Type, String negotiated_dscp,
			String pdp_Type) {
		super();
		Id_Conn = id_Conn;
		Service_Type = service_Type;
		Framed_Protocol = framed_Protocol;
		Rat_Type = rat_Type;
		Negotiated_dscp = negotiated_dscp;
		Pdp_Type = pdp_Type;
	}
	
	
	
}
