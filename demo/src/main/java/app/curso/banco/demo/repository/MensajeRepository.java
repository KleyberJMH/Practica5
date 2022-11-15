package app.curso.banco.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.curso.banco.demo.model.Mensaje;

@Repository
public interface MensajeRepository extends CrudRepository<Mensaje, Long>{

}