
public class Jueves20_while {
	public static void main(String[] args) {
		String[] listaPaises = {"España", "Italia", "Francia", "Alemania","Brasil","Argentina"};
		int contador = 0;
				while(contador < 6) {
					if(contador%2 == 1) {
						System.out.println("El pais " + (contador) + " del array de paises es " + listaPaises[contador]);
					}
					contador = contador + 1;
				}
	}
}
