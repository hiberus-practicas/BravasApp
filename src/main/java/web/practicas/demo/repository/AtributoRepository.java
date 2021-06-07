package web.practicas.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.practicas.demo.model.Atributo;
@Repository
public interface AtributoRepository  extends JpaRepository<Atributo,Long>{
	
	@Query(value="INSERT INTO atributo(nombre_atributo,descripcion,tipo_dato) VALUES :nombre,:descripcion,:tipo",nativeQuery = true)
	public void guardaratributo(String nombre,String descripcion,String tipo);
	
}
