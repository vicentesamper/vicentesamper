
public class Jueves20_prepostincremento {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		
		b = a++; // aqu� b valdr�a 3
		System.out.println("El valor de a: " + a);
		System.out.println("El valor de b: " + b);
		
		int c = a++ - ++b; // c = 3 - 2
		System.out.println("El valor de c: " + c);
		
	}
}

/* 

a++ es hacer un incremento de 1 despu�s de ejecutar la acci�n (postincremento)
++a aqu� el incremento seria anterior a realizar la acci�n (preincremento)

pero si en la misma f�rmula hay varios a, en el segundo que aparezca si que se realizar� la acci�n previa sea post o pre

a=2
d= a++ + a  ser�a d= 2 + 3

a=2
d= ++a - a++ + a  ser�a d = 3 - 3 + 4

a++ es igual que a + 1



De la misma manera;
a-- Postdecremento
--a Predecremento

*/