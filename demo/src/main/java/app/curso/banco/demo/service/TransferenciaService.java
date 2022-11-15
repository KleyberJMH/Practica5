package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Transferencia;
import app.curso.banco.demo.repository.TransferenciaRepository;

@Service
public class TransferenciaService {
	//Vincular GestorRepository
	@Autowired
	TransferenciaRepository transferenciaRespository;
	
	//Buscar todos los clientes
	public ArrayList<Transferencia> obtenerTransferencias(){
		
		return (ArrayList<Transferencia>)this.transferenciaRespository.findAll();
	}
	
	//Buscar un cliente por id
	public Optional<Transferencia>  obtenerTransferencia(Long id) {
		return this.transferenciaRespository.findById(id);
	}
	
	//Crea o actualiza un cliente y lo devuelve con id
	public Transferencia guardarTransferencia(Transferencia transferencia) {
		return this.transferenciaRespository.save(transferencia);
	}
	
	//Eliminar cliente
	public boolean borrarTransferencia(Long id) {
		try {
			this.transferenciaRespository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	
 }