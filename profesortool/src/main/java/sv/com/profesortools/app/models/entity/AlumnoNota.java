package sv.com.profesortools.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AlumnoNota implements Serializable {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Alumno alumno;
	
	@ManyToOne(fetch =FetchType.LAZY )
	private Nota nota;
	
	private double total;
	
	private boolean reprobado=true;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}




	public Nota getNota() {
		return nota;
	}


	public void setNota(Nota nota) {
		this.nota = nota;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public boolean isReprobado() {
		return reprobado;
	}


	public void setReprobado(boolean reprobado) {
		this.reprobado = reprobado;
	}


	private static final long serialVersionUID = 1L;
}
