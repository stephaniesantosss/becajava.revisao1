CREATE PROCEDURE SP_INSERT_TIPO_VEICULO
	@TipoVeiculo varchar(100)
	AS
BEGIN
insert into [Tipo Veiculo] Values(@TipoVeiculo)
END

EXEC SP_INSERT_TIPO_VEICULO 'Moto'
EXEC SP_INSERT_TIPO_VEICULO 'Carro'


select * from [Tipo Veiculo]