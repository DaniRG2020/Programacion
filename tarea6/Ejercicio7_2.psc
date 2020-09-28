Proceso Ejercicio7_2
	//Ejercicio7-2: Haz un programa que permita calcular la suma de pares de números. Pedirá dos números al usuario y mostrará su suma,
	//volviendo a repetir hasta que ambos números introducidos sean 0. Esta vez deberás usar "Repetir", por lo que tu solución no será igual que
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
