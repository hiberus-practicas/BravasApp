package web.practicas.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.practicas.demo.repository.AtributoRepository;
import web.practicas.demo.repository.UsuarioRepository;

@Service
public class AuxService  {
	@Autowired
	AtributoRepository repositorioAtributos;
	UsuarioRepository repositorioUsuario;
	
	

	
}
