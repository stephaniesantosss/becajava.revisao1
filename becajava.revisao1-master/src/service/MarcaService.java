package service;

import model.Marca;
import repository.MarcaRepository;

public class MarcaService {
	public Marca GetMarca(int indice) {

		MarcaRepository repository = new MarcaRepository();
		Marca marca = repository.GetMarca(indice);
		return marca;
	}

	public void SetMarca(Marca marca) {
		MarcaRepository repository = new MarcaRepository();
		repository.SetMarca(marca);

	}

}
