Proceso Ejercicio4_6
	//Ejercicio4_6: Prepara un programa que pida al usuario tres números y diga cuál es el mayor de los tres.
	Definir a,b,c Como Entero
	Escribir "Escribe tres numeros"
	leer a,b,c
	si a > b
		si a>c Entonces
			Escribir "El numero ",a,"es el mayor de los tres"
		sino
			Escribir "el numero",c,"es el mayor de los tres"
			
		FinSi
	sino 
		si b > c Entonces
			Escribir "el numero",b," es el mayor de los tres"
		SiNo
			Escribir "El numero",c,"es el mayor de los tres"
			
		FinSi
	FinSi
	
	
FinProceso
