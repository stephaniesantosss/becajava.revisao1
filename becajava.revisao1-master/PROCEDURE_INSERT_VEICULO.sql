CREATE PROCEDURE SP_INSERT_VEICULO
    @NomeVeiculo varchar(100),
    @Placa varchar(100),
    @Valor int,
    @TipoVeiculo int,
    @MarcaId int
    AS
BEGIN
insert into Veiculo Values(@NomeVeiculo, @Placa, @Valor, @TipoVeiculo, @MarcaId)
END

EXEC SP_INSERT_VEICULO 'XRE', 'XRE123', 12000, 2, 5
EXEC SP_INSERT_VEICULO 'Fox', 'DEF5678', 15000, 1, 1
EXEC SP_INSERT_VEICULO 'Onix', 'GHI9012', 17000, 1, 3
EXEC SP_INSERT_VEICULO 'Corolla', 'JKL1357', 15000, 1, 4
EXEC SP_INSERT_VEICULO 'Biz', 'EOT8180', 10000, 1, 5


select * from Veiculo