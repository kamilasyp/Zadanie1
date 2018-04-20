import java.io.IOException;
import java.util.Scanner;

public class Konwersja {
	final static int liczba = 0b1101_1011;

	private static final String wzorzec = "0123456789ABCDEF";
	
	
	public static  String konwersja(int n, int podstawaSystemu)
	
	{
		String result = "";
	
		
		 if ((podstawaSystemu > 36) || (podstawaSystemu < 2))
		      return null;
	
		  if (n == 0)
		      return "0";
		  
		  while (n>0)
		   {
		      result = wzorzec.charAt(n % podstawaSystemu) + result;
		      n /= podstawaSystemu;
		   }

		   return result;
	
	}
	

		
	public static void main (String[] args) 
		throws IOException
	{
		
		
		System.out.println("Witaj w programie konwertuj¹cym liczbê 0b1101_1011 " + '\n'+"na system trójkowy, dziesiêtny lub szesnastkowy. ");
		System.out.println("Wybierz dzia³anie, które chcesz wykonaæ. ");
		System.out.println("1. Zmiana na system trójkowy (wpisz 'trojkowy')");
		System.out.println("2. Zmiana na system dziesiêtny  (wpisz 'dziesietny')");
		System.out.println("3. Zmiana na system  (wpisz 'szesnastkowy')");
		
		
		Scanner odczyt = new Scanner (System.in);
		String wybor = odczyt.nextLine();
		
		switch(wybor) {
		
		case "trojkowy": {
			System.out.println("0b1101_1011 w systemie trojkowym = " + konwersja(0b1101_1011, 3));
			
		break;
		}
		case "dziesietny":{
			System.out.println("0b1101_1011 w systemie dziesiêtnym = " + konwersja(0b1101_1011, 10));
			break;
		}
		
		case "szesnastkowy":{
				System.out.println("0b1101_1011 w systemie szesnastkowym = " + konwersja(0b1101_1011, 16));
			break;
		}
		
		default:{
			System.out.println("Nieprawid³owy wybór!");
		
			}
		}
		
		    odczyt.close();
		    
	
		
		
	}
}
