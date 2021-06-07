package web.practicas.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
public class Atributo_Proyecto implements Serializable {
   @Id
    @ManyToOne
    private Atributo atributo;
    @Id
    @ManyToOne
    private Proyecto proyecto;
@Column(name = "value_numero")
   private Integer valuenumero;
@Column(name = "value_string")
    private String valueString;
@Column(name = "value_fecha")
    private Date valueFecha;
    
	public Atributo getAtributo() {
		return atributo;
	}
	public void setAtributo(Atributo atributo) {
		this.atributo = atributo;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Integer getValuenumero() {
		return valuenumero;
	}
	public void setValuenumero(Integer valuenumero) {
		this.valuenumero = valuenumero;
	}
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	public Date getValueFecha() {
		return valueFecha;
	}
	public void setValueFecha(Date valueFecha) {
		this.valueFecha = valueFecha;
	}
    



}
