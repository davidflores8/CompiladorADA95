procedure Hola () is
	primero,segundo:INTEGER;

begin	
	put("Ingrese el primer numero: ");
	get(primero);
	put("Ingrese el segundo numero: ");
	get(segundo);
	if(primero>segundo) then
		put("Primero es mayor");
	end if;
	primero:=primero+segundo;
	put(primero);
	put("Buen dia");
	put("Este es el fin del programa");
	

end CUENTA; 
