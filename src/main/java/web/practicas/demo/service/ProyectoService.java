package web.practicas.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.practicas.demo.model.Proyecto;
@Service
public class ProyectoService extends BaseServiceImplementation<Proyecto, Long> {
	@Autowired
	ProyectoService servicio;

}
