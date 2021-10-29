package com.example.deployment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> { 
	Usuario findByNombre(String nombres);
	Usuario findById(int id);
	
	@Query (value = "SELECT u FROM Usuario u WHERE u.nombre like %:nombre%")
	List<Usuario> findByNombreLike(@Param("nombre") String nombre);
	
	@Query (value = "SELECT MAX(r.id_usuario) FROM Usuario r")
	int consec();
}
