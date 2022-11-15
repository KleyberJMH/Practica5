package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Cliente;
import app.curso.banco.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	//Vincular GestorRepository
	@Autowired
	ClienteRepository clienteRespository;
	
	//Buscar todos los clientes
	public ArrayList<Cliente> obtenerClientes(){
		
		return (ArrayList<Cliente>)this.clienteRespository.findAll();
	}
	
	//Buscar un cliente por id
	public Optional<Cliente>  obtenerCliente(Long id) {
		return this.clienteRespository.findById(id);
	}
	
	//Crea o actualiza un cliente y lo devuelve con id
	public Cliente guardarCliente(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}
	
	//Eliminar cliente
	public boolean borrarCliente(Long id) {
		try {
			this.clienteRespository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	
 }
