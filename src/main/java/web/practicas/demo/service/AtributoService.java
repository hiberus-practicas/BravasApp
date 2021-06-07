package web.practicas.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.practicas.demo.model.Atributo;
import web.practicas.demo.repository.AtributoRepository;
@Service

public class AtributoService  {
	@Autowired
	AtributoRepository repository;
	public AtributoService(AtributoRepository repository) {
		this.repository=repository;
	 
	}
	
	public List<Atributo> listall() throws Exception {

		try {
			return repository.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public Optional<Atributo> listbyid(Long id) throws Exception {

		try {
			return repository.findById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public Atributo add(Atributo entidad) throws Exception {

		try {
			
			return repository.save(entidad);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public Atributo update(Long id, Atributo entidad) throws Exception {

		try {
			if(id.equals(entidad.getNombreAtributo()))
			return repository.save(entidad);
			else {
				return entidad;
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void delete(Long id) throws Exception {

		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
