CREATE PROCEDURE SP_INSERT_MARCA
    @MARCA varchar(100),
    AS
BEGIN
INSERT INTO Marca Values(@Marca)
END

SP_INSERT_MARCA ('Volkswagen')
SP_INSERT_MARCA ('Jeep')
SP_INSERT_MARCA ('Chevrolet')
SP_INSERT_MARCA ('Toyota')


select * from Marca