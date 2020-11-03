package service;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {

	public Cliente GetCliente(int indice) {

		ClienteRepository repository = new ClienteRepository();
		Cliente cliente = repository.GetCliente(indice);
		return cliente;
	}

	public void SetCliente(Cliente cliente) {
		ClienteRepository repository = new ClienteRepository();
		repository.SetCliente(cliente);

	}

}
