package service;

import model.Loja;
import repository.LojaRepository;

public class LojaService {

	public Loja GetLoja(int indice) {

		LojaRepository repository = new LojaRepository();
		Loja loja = repository.GetLoja(indice);
		return loja;
	}

	public void SetLoja(Loja loja) {
		LojaRepository repository = new LojaRepository();
		repository.SetLoja(loja);

	}

}
