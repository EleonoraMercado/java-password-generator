import java.time.LocalDateTime;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Salvare in opportune variabili il nome, cognome, colore preferito e data di nascita
		//suddivisa in giorno, mese e anno in numero. Generere e stampare a video una password
		//concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita separate dal carattere -
		
		System.out.println("Generazione di una password "
				+ "con i dati inseriti dall'utente");
		
		
		System.out.println ("Inserisci il tuo nome");
		Scanner scan = new Scanner(System.in);
		
		
		String nome = scan.nextLine();
		
		
		System.out.println("Inserisci il tuo cognome");
		String cognome = scan.nextLine();
		
		
		System.out.println("Inserisci il tuo colore preferito");
		String colorePreferito = scan.nextLine();
		
		
		System.out.println("Inserisci il tuo giorno di nascita");
		int giorno = scan.nextInt();
		
		
		System.out.println("Inserisci il tuo mese di nascita");
		int mese = scan.nextInt();
		
		
		System.out.println("Inserisci il tuo anno di nascita");
		int anno = scan.nextInt();
		
		 LocalDateTime datariderimento =
				 LocalDateTime.of(anno, mese, giorno, 0, 0);
		 
		 System.out.println("Stiamo calcolando la tua password...");
		 
		 String passwordCalcolata =
				 nome + "-" + cognome + "-" + colorePreferito + "-" + (giorno +mese + anno);
		 
		 System.out.println("Password in elaborazione");
		 
		 System.out.println("La tua paaaword generata è " + passwordCalcolata);
		 
	}

}
