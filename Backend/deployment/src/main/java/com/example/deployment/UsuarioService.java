package com.example.deployment;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
	List<Usuario> listar();
	Usuario listarId(int id);
	Usuario add(Usuario p);
	Usuario edit(Usuario p);
	void delete(Usuario p);
	List<Roles> roles();
	List<Usuario> buscador(String nombre);
	int consec();
	
	Usuario findByNombre(String nombres);
}
