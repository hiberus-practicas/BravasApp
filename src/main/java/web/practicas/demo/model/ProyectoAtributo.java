package web.practicas.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

import org.hibernate.mapping.PrimaryKey;

@Entity
@IdClass(Primarykey.class)
public class ProyectoAtributo {
	@Id
	String proyecto;
	@Id
	Long atributo;
	
	private String valorString;
	private Integer valorInteger;
	private Date valorDate;
	
	public ProyectoAtributo() {
		super();
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public Long getAtributo() {
		return atributo;
	}

	public void setAtributo(Long atributo) {
		this.atributo = atributo;
	}

	public String getValorString() {
		return valorString;
	}

	public void setValorString(String valorString) {
		this.valorString = valorString;
	}

	public Integer getValorInteger() {
		return valorInteger;
	}

	public void setValorInteger(Integer valorInteger) {
		this.valorInteger = valorInteger;
	}

	public Date getValorDate() {
		return valorDate;
	}

	public void setValorDate(Date valorDate) {
		this.valorDate = valorDate;
	}

	public ProyectoAtributo(String proyecto, Long atributo, String valorString, Integer valorInteger, Date valorDate) {
		super();
		this.proyecto = proyecto;
		this.atributo = atributo;
		this.valorString = valorString;
		this.valorInteger = valorInteger;
		this.valorDate = valorDate;
	}


	
	
	
	
	

}
