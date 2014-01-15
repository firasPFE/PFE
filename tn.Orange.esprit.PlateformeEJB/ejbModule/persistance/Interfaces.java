package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Interfaces implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id_Interface;
	private String Name_Interface;
	private Date date;
	
	

	
	public Interfaces() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_Interface() {
		return Id_Interface;
	}
	public void setId_Interface(int id_Interface) {
		Id_Interface = id_Interface;
	}
	public String getName_Interface() {
		return Name_Interface;
	}
	public void setName_Interface(String name_Interface) {
		Name_Interface = name_Interface;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Interfaces(int id_Interface, String name_Interface, Date date) {
		super();
		Id_Interface = id_Interface;
		Name_Interface = name_Interface;
		this.date = date;
	}
}
