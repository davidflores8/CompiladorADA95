procedure Hola () is
	primero,segundo:INTEGER:=23;
begin	
	if(primero>segundo) then
		put("Dentro del if");
	elseif (primero<segundo) then
		put("Dentro del elseif");	
	else 
		put("Dentro del else");
	end if;

	put("Fuera de todo");
	put("Otra vez fuera de todo");

end CUENTA;
