package sv.com.profesortools.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Materia implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	@Column(unique = true, length = 30)
	@Size(max = 30)
	private String nombre;
	
	@Column(length = 2)
	private int dificultad;
	
	@ManyToOne(fetch =FetchType.LAZY )
	private InfoMateria infomateria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario profesor;
	
	
	private static final long serialVersionUID = 1L;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDificultad() {
		return dificultad;
	}


	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

}
