procedure Hola () is
	numero:INTEGER;
begin	
	put("Ingrese un numero: ");
	get(numero);
	loop
		put("Dentro del loop");
		put("Todavia dentro del loop");
	exit when numero>5;
	end loop;

	put("Fuera de todo");
	put("Otra vez fuera de todo");

end CUENTA; 
