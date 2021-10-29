package com.example.deployment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/usuarios"})
public class Controlador {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping("/listar")
	public List<Usuario> Listar() {
		return service.listar();
	}
	
	@PostMapping("/adicionar")
	public Usuario agregar(@RequestBody Usuario p) {
		return service.add(p);
	}
	
	@PostMapping("/eliminar")
	public void eliminar(@RequestBody Usuario p) {
		service.delete(p);
	}
	
	@GetMapping("/consultarFindOne/{id}")
	public Usuario consultarById(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@PutMapping("/editar/{id}")
	public Usuario editar(@RequestBody Usuario p, @PathVariable("id") int id) {
		p.setId_usuario(id);
		return service.edit(p);
	}
	
	@GetMapping("/consultar/{username}")
	public Usuario buscarUsername(@PathVariable("username") String username) {
		return service.findByNombre(username);
	}
	
	@GetMapping("/consultarRoles")
	public List<Roles> consultarRoles() {
		return service.roles();
	}
	
	@GetMapping("/buscador/{nombre}")
	public List<Usuario> buscador(@PathVariable("nombre") String nombre) {
		return service.buscador(nombre);
	}
	
	@GetMapping("/consec")
	public int consec() {
		return service.consec()+1;
	}
}
