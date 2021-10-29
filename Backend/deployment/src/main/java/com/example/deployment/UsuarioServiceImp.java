package com.example.deployment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Autowired
	private RolesRepositorio repositorioRoles;

	@Override
	public List<Usuario> listar() {
		return repositorio.findAll();
	}

	@Override
	public Usuario listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Usuario add(Usuario p) {
		return repositorio.save(p);
	}

	@Override
	public Usuario edit(Usuario p) {
		return repositorio.save(p);
	}

	@Override
	public void delete(Usuario p) {
		repositorio.delete(p);
	}	
	
	@Override
	public Usuario findByNombre(String username) {
		return repositorio.findByNombre(username);
	}
	
	@Override
	public List<Roles> roles() {
		return repositorioRoles.findAll();
	}
	
	@Override
	public List<Usuario> buscador(String nombre) {
		return repositorio.findByNombreLike(nombre);
	}
	
	@Override
	public int consec() {
		return repositorio.consec();
	}
}
