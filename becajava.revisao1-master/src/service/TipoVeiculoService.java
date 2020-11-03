package service;

import model.TipoVeiculo;
import repository.TipoVeiculoRepository;

public class TipoVeiculoService {
	public TipoVeiculo GetTipoVeiculo(int indice) {

		TipoVeiculoRepository repository = new TipoVeiculoRepository();
		TipoVeiculo tipoVeiculo = repository.GetTipoVeiculo(indice);
		return tipoVeiculo;
	}

	public void SetTipoVeiculo(TipoVeiculo tipoVeiculo) {
		TipoVeiculoRepository repository = new TipoVeiculoRepository();
		repository.SetTipoVeiculo(tipoVeiculo);

	}

}
