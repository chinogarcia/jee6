package ar.com.nextel.jee6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SFA_FORMA_PAGO")
@SequenceGenerator(name = "sequence", sequenceName = "SFA_FORMA_PAGO_SQ", allocationSize=1)
//@Where(clause = "borrado = 'F'")
public class FormaPago{
	
	private Long id;	
	private String descripcion;
//	private Boolean borrado;

	@Id
	@Column(name="ID_FORMA_PAGO")
	@GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	
	@Column(name = "DESCRIPCION")
	public String getDescripcion() {
		return descripcion;
	}

//	@Column(name="BORRADO")
//	@Type(type="true_false")
//	public Boolean getBorrado() {
//		return borrado;
//	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public void setBorrado(Boolean borrado) {
//		this.borrado = borrado;
//	}
}