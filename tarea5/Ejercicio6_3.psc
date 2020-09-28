Proceso Ejercicio6_3
	//Ejercicio6-3: Crea un programa que genere dos números al azar entre el 0 y el 100, y pida al usuario que calcule e introduzca su suma. 
	//Si la respuesta no es correcta, deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte. 
	//Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes hacer numero <- AZAR(101)
	
	Definir n,n2,Aleat Como Entero
	Aleat <- azar(100)
	Escribir Aleat
	Escribir "Dime un numero"
	leer n
	Escribir "Dime otro numero"
	leer n2
	si Aleat = n+n2
		Escribir "acertastes"
	SiNo
		Escribir "No acertastes"
	FinSi
	Mientras n+n2 <> Aleat
		
		Escribir Aleat
		Escribir "Dime un numero"
		leer n
		Escribir "Dime otro numero"
		leer n2
		si Aleat = n+n2
			Escribir "acertastes"
		SiNo
			Escribir "No acertastes"
		FinSi
		
		
	FinMientras
FinProceso
