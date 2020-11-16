package sv.com.profesortools.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Nivel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	private String nivelN;
	
	@NotEmpty
	private String nivelS;
	

	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNivelN() {
		return nivelN;
	}



	public void setNivelN(String nivelN) {
		this.nivelN = nivelN;
	}



	public String getNivelS() {
		return nivelS;
	}



	public void setNivelS(String nivelS) {
		this.nivelS = nivelS;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
