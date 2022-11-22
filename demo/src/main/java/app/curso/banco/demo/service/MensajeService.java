package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Mensaje;
import app.curso.banco.demo.repository.MensajeRepository;

@Service
public class MensajeService {
	//Vincular GestorRepository
	@Autowired
	MensajeRepository mensajeRespository;
	
	//Buscar todos los clientes
	public ArrayList<Mensaje> obtenerMensajes(){
		
		return (ArrayList<Mensaje>)this.mensajeRespository.findAll();
	}
	
	//Buscar un cliente por id
	public Optional<Mensaje>  obtenerMensaje(Long id) {
		return this.mensajeRespository.findById(id);
	}
	
	//Crea o actualiza un cliente y lo devuelve con id
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return this.mensajeRespository.save(mensaje);
	}
	
	//Eliminar cliente
	public boolean borrarMensaje(Long id) {
		try {
			this.mensajeRespository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	//Buscar por idOrigen
	public ArrayList<Mensaje> obtenerPorOrigen(Long id){
		return this.mensajeRespository.findByOrigenId(id);
	}
	
	
	
 }
