package repository;

import java.util.ArrayList;
import java.util.List;

import model.TipoVeiculo;

public class TipoVeiculoRepository {
	public List<TipoVeiculo> Lista = new ArrayList<TipoVeiculo>();

	public TipoVeiculo GetTipoVeiculo(int indice) {
		return new TipoVeiculo();
	}

	public List<TipoVeiculo> GetAllTipoVeiculo(int indice) {
		return new ArrayList<TipoVeiculo>();
	}

	public void SetTipoVeiculo(TipoVeiculo tipoVeiculo) {

	}
}