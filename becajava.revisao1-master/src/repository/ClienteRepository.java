package repository;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteRepository {
	public List< Cliente> Lista = new ArrayList< Cliente>();

	public  Cliente GetCliente(int indice) {
		return new  Cliente();
	}

	public List< Cliente> GetAllCliente(int indice) {
		return new ArrayList< Cliente>();
	}

	public void SetCliente( Cliente cliente) {

	}
}
