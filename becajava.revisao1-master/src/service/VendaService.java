package service;

import model.Venda;
import repository.VendaRepository;

public class VendaService {
	public Venda GetVenda(int indice) {

		VendaRepository repository = new VendaRepository();
		Venda venda = repository.GetVenda(indice);
		return venda;
	}

	public void SetVenda(Venda venda) {
		VendaRepository repository = new VendaRepository();
		repository.SetVenda(venda);

	}


}
