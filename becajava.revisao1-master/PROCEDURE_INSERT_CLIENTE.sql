CREATE PROCEDURE SP_INSERT_CLIENTE
	@NomeCliente varchar(100),
	@CPF varchar(100)
	AS
BEGIN
insert into Cliente Values(@NomeCliente, @CPF)
END

EXEC SP_INSERT_CLIENTE 'Danilo', 12345678912
EXEC SP_INSERT_CLIENTE 'Michelli', 8765432112


select * from Cliente