
public class Jueves20_prepostincremento {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		
		b = a++; // aquí b valdría 3
		System.out.println("El valor de a: " + a);
		System.out.println("El valor de b: " + b);
		
		int c = a++ - ++b; // c = 3 - 2
		System.out.println("El valor de c: " + c);
		
	}
}

/* 

a++ es hacer un incremento de 1 después de ejecutar la acción (postincremento)
++a aquí el incremento seria anterior a realizar la acción (preincremento)

pero si en la misma fórmula hay varios a, en el segundo que aparezca si que se realizará la acción previa sea post o pre

a=2
d= a++ + a  sería d= 2 + 3

a=2
d= ++a - a++ + a  sería d = 3 - 3 + 4

a++ es igual que a + 1



De la misma manera;
a-- Postdecremento
--a Predecremento

*/