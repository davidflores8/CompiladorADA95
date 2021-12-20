procedure Hola () is
	primero,segundo:INTEGER;
begin	
	put("Ingrese el primer numero: ");
	get(primero);
	put("Ingrese el segundo numero: ");
	get(segundo);
	if(primero>segundo) then
		put("Primero es mayor");
	else
		put("Segundo es mayor");	
	end if;

	put("Fuera de todo");

end CUENTA; 
