package web.practicas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.practicas.demo.model.Proyecto;
import web.practicas.demo.service.ProyectoService;
import web.practicas.demo.service.UsuarioService;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v01/proyectos")
public class ProyectoRest extends BaseControllerImplementation<Proyecto, ProyectoService>{
	@Autowired
	ProyectoService service;
	public ProyectoRest(ProyectoService service) {
		super(service);
	
	}

}
