
import java.util.Scanner;

public class Examen {
	
	public class primeraMayusculas { 
		
		private static Scanner scan;

		public static void main (String[]args)	{
			
				scan = new Scanner (System.in);
				
				String cadena; 
				
				System.out.println("Taclea la oracion que quieres que convierta tu primera letra en mayuscula:");
				cadena = scan.nextLine(); 
				
				cadena = cadena.substring(0, 1).toUpperCase() +cadena.substring(1);
				
				System.out.println("Tu nueva oracion es: " +cadena);
		
	}
	
	
	public class invertirCadena {
		
		public static void main (String[]args) {
			
			String invertir = ".occoR y yboT namall es sorrep siM";
			StringBuilder nueva = new StringBuilder (invertir); 
			
			nueva.reverse().toString();
			System.out.println("Su cadena invertida es: " +nueva); 
			
			
		}
	}
	
	public class vocalesMayuscula {
		
		private static Scanner scan;

		public static void main (String[]args) {
			
			scan = new Scanner (System.in);
			
			String vocales;
			
			System.out.println("Ingrese la oracion a concertir sus vocales en mayusculas:");
			vocales = scan.nextLine();
			
			vocales = vocales.replace("a", "A");
			vocales = vocales.replace("e", "E");
			vocales = vocales.replace("i", "I");
			vocales = vocales.replace("o", "O");
			vocales = vocales.replace("u", "U");
			
			System.out.println("Su nueva oracion con vocales en mayusculas quedo: " +vocales); 
			
		}
			
	}

	public class fizzBuzz {
	
		public static void main(String[]args) {
		
			int x = 100;
		
			for(int i = 1; i <= x; i++) {
				if(i % 5 == 0 && i % 3 == 0)
					System.out.println("FizzBuzz"); 
				else if (i % 5 == 0)
					System.out.println("Buzz");
				else if (i % 3 == 0)
					System.out.println("Fizz"); 
				else 
					System.out.println(i +" ");
				
		}
		
	}

}
	public class palindromo {
		
		public static boolean esPalindromo(String palabra) {
			
			palabra = palabra.toLowerCase();
			palabra = palabra.replace(" ", "");
			
			 
			int a = 0;
			int b = palabra.length()-1; 
			
			for(int i=0; i<palabra.length(); i++) {
				if(palabra.charAt(a) == palabra.charAt(b)) {
					a++;
					b--;  
				}
				else return false;
			}
			return true;
		} 
		
		@SuppressWarnings("resource")
		public static void main(String[]args) {
			
			Scanner lector = new Scanner (System.in);
			
			String palabra;
			
			System.out.println("Ingrese la palabra u oracion para determinar si es palindromo: " );
			palabra = lector.nextLine();
			
			if (esPalindromo(palabra))
				System.out.println("Es palindromo");
			else 
				System.out.println("No es palindromo");
			}
	
		}
	}
}
	

