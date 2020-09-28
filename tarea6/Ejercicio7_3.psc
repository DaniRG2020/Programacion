Proceso Ejercicio7_3
	//Ejercicio7-3: Prepara un programa que divida dos números que introduzca el usuario. Si el segundo número es cero, se le deberá avisar y volver a pedir
	//tantas veces como sea necesario, hasta que introduzca un número distinto de cero, momento en que se calculará y mostrará el resultado de la división.
	Definir n1, n2 Como Entero
	
	
	Escribir "dime un numero"
	leer n1
	Escribir "dime otro numero"
	leer n2
	
	si n2=0
		Repetir 
			Escribir "Porfavor introduzca otro numero"
			leer n2
		Hasta Que n2 > 0 
	FinSi

	Escribir "resultado", n1/n2
FinProceso
