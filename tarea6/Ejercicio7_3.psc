Proceso Ejercicio7_3
	//Ejercicio7-3: Prepara un programa que divida dos n�meros que introduzca el usuario. Si el segundo n�mero es cero, se le deber� avisar y volver a pedir
	//tantas veces como sea necesario, hasta que introduzca un n�mero distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.
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
