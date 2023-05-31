//ciclo for
// for annidato (i è minore di 5 ? o kstampa riga, poi entra nel secondo for, poi finisce e 
// rientra nel primo for con valore di 1 e cosi via)
//versione enhanced (creo un array e stampo tutti i valori dell'array)
// break( se la condizione nel for si presenta il for si interrompe
// continue (se la condizioen nel for si presenta salta quel determinato valore)

public class CicloFor {

	public static void main(String[] args) {
		
		
		for(int i= 0; i < 5; i++) {
			System.out.println("Riga " + i);
			for(int j= 0; j < 5; j++) {
				System.out.println("colonna " + j);
			}
		}
		
		//versione enhanced
		int[] numeri = {10, 20, 30, 40};
		for(int numero: numeri) {
			System.out.println(numero);
		}
		
		for(int i= 0; i < 5; i++) {
			if(i == 4) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i= 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}