Algoritmo Ejercicio6_1
	//Ejercicio6-1: Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras que no introduzca "1234". Cuando finalmente escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.
	Definir contraseña Como Entero
	Escribir "Introduce contraseña"
	leer contraseña
	
	Mientras contraseña <> 1234  Hacer
		Escribir "contraseña erronea"
		Leer contraseña
	Fin Mientras
	Escribir "Bienvenido"
FinAlgoritmo
