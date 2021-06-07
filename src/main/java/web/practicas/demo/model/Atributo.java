package web.practicas.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="atributo")
public class Atributo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Atributo",nullable = false)
	private Long idAtributo;
	@Column(name="nombre_Atributo",unique = true,nullable = false)
	private String nombreAtributo;
	@Column(name="tipo_Dato")
	private String tipoDato;
	@Column(name="descripcion")
	private String descripcion;
	

	public Atributo(String nombreAtributo, String tipoDato, String descripcion) {
		
		this.nombreAtributo = nombreAtributo;
		this.tipoDato = tipoDato;
		this.descripcion = descripcion;
	}
	public Atributo() {
	
	}

	public String getNombreAtributo() {
		return nombreAtributo;
	}
	public void setNombreAtributo(String nombreAtributo) {
		nombreAtributo = nombreAtributo;
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
