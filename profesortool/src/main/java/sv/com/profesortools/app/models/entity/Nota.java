package sv.com.profesortools.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Nota implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 8, unique = true)
	@NotEmpty
	@Size(max = 8)
	private String codigo;
	
	@OneToMany(mappedBy="nota", fetch= FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Periodo> periodo;
	
	private static final long serialVersionUID = 1L;

}
