procedure Hola () is
    primero,segundo:INTEGER:=0;
begin	

put("A continuacion viene un if");
	if(primero<segundo) then
		put("Dentro del if");
		put("Primero es menor a segundo");
	elseif(primero>segundo) then
		put("Dentro del elseif");
		put("Primero es mayor a segundo");
	else
		put("Dentro del else");
		put("Primero es igual a segundo");
	end if;
	put("Fuera del if");
	put(primero);
	
end Hola; 
