package sv.com.profesortools.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Periodo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 2)
	private int numero;

	@Column(length = 40, unique = true)
	@Size(max = 40)
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	private Materia materia;

	@OneToMany(mappedBy = "periodo", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Periodo> periodo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Nivel nivel;

	@Column(length = 2)
	private int limite;

	private double total;

	public Periodo() {
		this.periodo = new ArrayList<Periodo>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	private static final long serialVersionUID = 1L;

}
