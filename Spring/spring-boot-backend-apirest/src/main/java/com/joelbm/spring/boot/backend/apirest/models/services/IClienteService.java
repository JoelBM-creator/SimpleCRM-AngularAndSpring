package com.joelbm.spring.boot.backend.apirest.models.services;

import java.util.List;

import com.joelbm.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
