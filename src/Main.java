import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in); 
		int numero = 0;
		int[] arreglo;
		
		System.out.println("Ingrese el número");
		numero = teclado.nextInt();
		
		arreglo = divisoresPrimos(numero);
		
		System.out.println(Arrays.toString(arreglo));
		
	}   
	
	static int[] divisoresPrimos(int n){
		int[] a = new int[n];
		int c = 0;
		

		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				
				int cc = 0;
				for (int j = 1; j <= i; j++) {
					if (i%j==0) {
						cc++;
					}
				}
				if(cc==2) {
					a[c] = i;
					c++;
				} 
				
			}
		}
		
		return a;
	}
}