package app.curso.banco.demo.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.curso.banco.demo.model.Cliente;
import app.curso.banco.demo.model.Gestor;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	public Optional<Cliente> findByCorreo(String correo);
	
	public ArrayList<Cliente> findByGestorId(Long id);
}