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
	ClienteRepository clienteRepository;
	
	//Buscar todos los clientes
	public ArrayList<Cliente> obtenerClientes(){
		
		return (ArrayList<Cliente>)this.clienteRepository.findAll();
	}
	
	//Buscar un cliente por id
	public Optional<Cliente>  obtenerCliente(Long id) {
		return this.clienteRepository.findById(id);
	}
	
	//Crea o actualiza un cliente y lo devuelve con id
	public Cliente guardarCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	//Eliminar cliente
	public boolean borrarCliente(Long id) {
		try {
			this.clienteRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	//Buscar por id gestor
	public ArrayList<Cliente> obtenerPorIdGestor(Long id) {
		return this.clienteRepository.findByGestorId(id);
	}
	
	
 }
