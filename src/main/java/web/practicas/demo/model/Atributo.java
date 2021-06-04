package web.practicas.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="atributo")
public class Atributo{
	@Id
	@Column(name="nombre_Atributo")
	String NombreAtributo;
	@Column(name="tipo_Dato")
	String tipoDato;
	@Column(name="descripcion")
	String descripcion;
	@OneToMany
	List<ProyectoAtributo> proyecto;
	
	


	public Atributo(String nombreAtributo, String tipoDato, String descripcion, List<ProyectoAtributo> proyecto) {
		super();
		NombreAtributo = nombreAtributo;
		this.tipoDato = tipoDato;
		this.descripcion = descripcion;
		this.proyecto = proyecto;
	}
	public List<ProyectoAtributo> getProyecto() {
		return proyecto;
	}
	public void setProyecto(List<ProyectoAtributo> proyecto) {
		this.proyecto = proyecto;
	}
	public Atributo(String nombreAtributo, String tipoDato, String descripcion) {
		super();
		NombreAtributo = nombreAtributo;
		this.tipoDato = tipoDato;
		this.descripcion = descripcion;
	}
	public Atributo() {
		super();
	}

	public String getNombreAtributo() {
		return NombreAtributo;
	}
	public void setNombreAtributo(String nombreAtributo) {
		NombreAtributo = nombreAtributo;
	}
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
