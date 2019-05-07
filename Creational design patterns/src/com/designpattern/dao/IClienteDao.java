package com.designpattern.dao;

import java.util.List;

public interface IClienteDao {
	public List<Cliente> obtenerClientes();
	public Cliente obtenerCliente(int id);
	public void actualizarCliente(Cliente cliente);
	public void eliminarCliente(Cliente cliente);
}
