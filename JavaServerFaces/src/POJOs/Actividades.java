package POJOs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actividades {
	@Id
	private int id;
	private String descrption;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
}
