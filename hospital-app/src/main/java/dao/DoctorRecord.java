package dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorRecord {
	@Id
	private int id;
	private String name;
	private String email;
	public DoctorRecord(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}

}
