Algoritmo Ejercicio6_1
	//Ejercicio6-1: Crea un programa que pida al usuario una contrase�a, de forma repetitiva mientras que no introduzca "1234". Cuando finalmente escriba la contrase�a correcta, se le dir� "Bienvenido" y terminar� el programa.
	Definir contrase�a Como Entero
	Escribir "Introduce contrase�a"
	leer contrase�a
	
	Mientras contrase�a <> 1234  Hacer
		Escribir "contrase�a erronea"
		Leer contrase�a
	Fin Mientras
	Escribir "Bienvenido"
FinAlgoritmo
