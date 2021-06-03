package web.practicas.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto extends Base{

	@Column(name = "nombre")
	String nombre;
	@Column(name = "equipo")
	String equipo;
	@OneToMany
	List<Atributo> atributos;
	

	public Proyecto(String nombre, String equipo) {
		
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
