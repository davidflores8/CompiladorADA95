procedure Hola (Valor: in Integer;  Valorcito: out Float) is
    numero,principal:Integer:=34;
    principal,secundario:Float:=34.45;
begin

	for i in principal loop
		put("Ingrese un numero" );
		get(numero);
	end loop;

put("Felicidades, el numero fue ingresado exitosamente");
end CUENTA; 
