package service;

import model.Vendedor;
import repository.VendedorRepository;

public class VendedorService {
	public Vendedor GetVendedor(int indice) {

		VendedorRepository repository = new VendedorRepository();
		Vendedor vendedor = repository.GetVendedor(indice);
		return vendedor;
	}

	public void SetVendedor(Vendedor vendedor) {
		VendedorRepository repository = new VendedorRepository();
		repository.SetVendedor(vendedor);

	}

}
