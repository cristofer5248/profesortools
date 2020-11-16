package sv.com.profesortools.app.models.entity;

import java.io.Serializable;
import java.util.Date;

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
public class Alumno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty	
	@Column(unique = true, length = 20)
	@Size(max = 20)
	private String username;
	
	@NotEmpty
	@Column(length = 60)
	@Size(max = 60)
	private String nombre;
	
	@NotEmpty
	@Column(length = 60)
	@Size(max = 60)
	private String apellido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Nivel nivel;
	
	@NotEmpty
	private Date fnacimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Encargado encargado;
	
	private String codigo;
	
	private static final long serialVersionUID = 1L;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public Date getFnacimiento() {
		return fnacimiento;
	}
	public void setFnacimiento(Date fnacimiento) {
		this.fnacimiento = fnacimiento;
	}
	public Encargado getEncargado() {
		return encargado;
	}
	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	

}
