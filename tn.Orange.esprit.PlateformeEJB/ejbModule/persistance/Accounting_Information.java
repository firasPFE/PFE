package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Accounting_Information implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Acct_Session_Id ;
	private String Acct_Status_Type;
	private String Acct_Authentic;
	private int Acct_Delay_Time;
	private int Acct_Input_Octets;
	private int Acct_Output_Octets;
	private int Acct_Input_Packets;
	private int Acct_Output_Packets;
	
	
	
	
	public Accounting_Information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAcct_Session_Id() {
		return Acct_Session_Id;
	}
	public void setAcct_Session_Id(String acct_Session_Id) {
		Acct_Session_Id = acct_Session_Id;
	}
	public String getAcct_Status_Type() {
		return Acct_Status_Type;
	}
	public void setAcct_Status_Type(String acct_Status_Type) {
		Acct_Status_Type = acct_Status_Type;
	}
	public String getAcct_Authentic() {
		return Acct_Authentic;
	}
	public void setAcct_Authentic(String acct_Authentic) {
		Acct_Authentic = acct_Authentic;
	}
	public int getAcct_Delay_Time() {
		return Acct_Delay_Time;
	}
	public void setAcct_Delay_Time(int acct_Delay_Time) {
		Acct_Delay_Time = acct_Delay_Time;
	}
	public int getAcct_Input_Octets() {
		return Acct_Input_Octets;
	}
	public void setAcct_Input_Octets(int acct_Input_Octets) {
		Acct_Input_Octets = acct_Input_Octets;
	}
	public int getAcct_Output_Octets() {
		return Acct_Output_Octets;
	}
	public void setAcct_Output_Octets(int acct_Output_Octets) {
		Acct_Output_Octets = acct_Output_Octets;
	}
	public int getAcct_Input_Packets() {
		return Acct_Input_Packets;
	}
	public void setAcct_Input_Packets(int acct_Input_Packets) {
		Acct_Input_Packets = acct_Input_Packets;
	}
	public int getAcct_Output_Packets() {
		return Acct_Output_Packets;
	}
	public void setAcct_Output_Packets(int acct_Output_Packets) {
		Acct_Output_Packets = acct_Output_Packets;
	}
	public Accounting_Information(String acct_Session_Id,
			String acct_Status_Type, String acct_Authentic,
			int acct_Delay_Time, int acct_Input_Octets, int acct_Output_Octets,
			int acct_Input_Packets, int acct_Output_Packets) {
		super();
		Acct_Session_Id = acct_Session_Id;
		Acct_Status_Type = acct_Status_Type;
		Acct_Authentic = acct_Authentic;
		Acct_Delay_Time = acct_Delay_Time;
		Acct_Input_Octets = acct_Input_Octets;
		Acct_Output_Octets = acct_Output_Octets;
		Acct_Input_Packets = acct_Input_Packets;
		Acct_Output_Packets = acct_Output_Packets;
	}

	
	
}
