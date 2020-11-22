package sv.com.profesortools.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class InfoMateria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 2)
	@Size(max = 2)
	private int limiteperiodo;
	
	@Column(length = 2)
	@Size(max = 2)
	private int limitemeses;
	
	@Column(length = 2)
	@Size(max = 2)
	private int limitenota;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getLimiteperiodo() {
		return limiteperiodo;
	}



	public void setLimiteperiodo(int limiteperiodo) {
		this.limiteperiodo = limiteperiodo;
	}



	public int getLimitemeses() {
		return limitemeses;
	}



	public void setLimitemeses(int limitemeses) {
		this.limitemeses = limitemeses;
	}



	public int getLimitenota() {
		return limitenota;
	}



	public void setLimitenota(int limitenota) {
		this.limitenota = limitenota;
	}



	private static final long serialVersionUID = 1L;
	

}
