CREATE PROCEDURE SP_VENDA_REALIZADA
	 @DataVenda varchar(100),
    @ClienteId int,
    @VendedorId int,
    @VeiculoId int
AS   
BEGIN
INSERT INTO Venda Values( @DataVenda, @ClienteId,@VendedorId,@VeiculoId )
END

EXEC SP_VENDA_REALIZADA '19/10/2020', 2, 1, 2
EXEC SP_VENDA_REALIZADA '22/10/2020', 1, 3, 4

SELECT * FROM Venda