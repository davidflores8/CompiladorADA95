procedure Hola (Valor: in Integer;  Valor2: out Float) is
    primero,segundo:Integer:=34;
    principal,secundario:Float:=34.45;
begin	
put("A continuacion viene una funcion");

	function mayor (Primero: in Integer; Segundo: in Integer) return Integer is 
    	final:Integer;
    begin   
            if(Primero>Segundo) then 
                Final:=Primero;
            else
                Final:=Segundo;
            end if;
    return Final;
    end mayor;
end CUENTA; 
