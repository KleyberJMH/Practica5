package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Gestor;
import app.curso.banco.demo.repository.GestorRepository;

@Service
public class GestorService {
	//Vincular GestorRepository
	@Autowired
	GestorRepository gestorRespository;
	
	//Buscar todos los gestores
	public ArrayList<Gestor> obtenerGestores(){
		
		return (ArrayList<Gestor>)this.gestorRespository.findAll();
	}
	
	//Buscar un gestor por id
	public Optional<Gestor>  obtenerGestor(Long id) {
		return this.gestorRespository.findById(id);
	}
	
	//Crea o actualiza un gestor y lo devuelve con id
	public Gestor guardarGestor(Gestor gestor) {
		return this.gestorRespository.save(gestor);
	}
	
	//
	public boolean borrarGestor(Long id) {
		try {
			this.gestorRespository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	
 }
