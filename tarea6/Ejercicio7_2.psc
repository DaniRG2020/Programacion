Proceso Ejercicio7_2
	//Ejercicio7-2: Haz un programa que permita calcular la suma de pares de n�meros. Pedir� dos n�meros al usuario y mostrar� su suma,
	//volviendo a repetir hasta que ambos n�meros introducidos sean 0. Esta vez deber�s usar "Repetir", por lo que tu soluci�n no ser� igual que
	//la del ejercicio 6.2, que empleaba "Mientras".
	Definir n1, n2 Como Entero
	Escribir "Primer numero"
	Leer n1
	Escribir "Segundo numero"
	leer n2
	Escribir "El resultado es", n1+n2
	Repetir
		Escribir "Primer numero"
		Leer n1
		Escribir "Segundo numero"
		leer n2
		Escribir "El resultado es", n1+n2
	Hasta Que n1+n2 = 0
FinProceso
