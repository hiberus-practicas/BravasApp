package web.practicas.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.practicas.demo.model.Atributo;
import web.practicas.demo.repository.AtributoRepository;
import web.practicas.demo.service.AtributoService;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v01/atributos")
public class AtributoRest {
	@Autowired
	AtributoService service;
	public AtributoRest(AtributoService service) {
	this.service=service;
	}


	@GetMapping("")
	public ResponseEntity<List<Atributo>> listall() throws Exception {
		try {

			return ResponseEntity.status(HttpStatus.OK).body(service.listall());
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Atributo> listbyid(Long id) throws Exception {
		try {

			return ResponseEntity.status(HttpStatus.OK).body(service.listbyid(id).get());
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}

	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Atributo entidad) throws Exception {
		try {
		
			return ResponseEntity.status(HttpStatus.OK).body(service.add(entidad));
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

@PutMapping("/{id}")
	public ResponseEntity<?> update(Long id,Atributo  entidad) throws Exception {
		try {
			
			
			return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entidad));
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(Long id) throws Exception {

		try {
			service.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("{'Petición':'Recurso Borrado'}");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{'error':'Petición invalida'}");
		}
	

}
}
