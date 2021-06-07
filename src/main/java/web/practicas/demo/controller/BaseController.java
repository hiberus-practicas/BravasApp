package web.practicas.demo.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import web.practicas.demo.model.Base;

public interface BaseController<E extends Base,ID extends Serializable> {
	
	ResponseEntity <List<E>> listall() throws Exception ;
	ResponseEntity<?>listbyid(@PathVariable ID id)throws Exception;
	ResponseEntity<?>add(@RequestBody E entidad)throws Exception;
	ResponseEntity<?>update(@PathVariable ID id,E entidad)throws Exception;
	ResponseEntity<?> delete(@PathVariable ID id)throws Exception;

}
