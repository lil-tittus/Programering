import java.util.Scanner;
public class V37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String F�rnamn = input.nextLine();
		
	
		System.out.println("Hur gammal �r du?");
		String Gammal = input.nextLine();
		
		System.out.println("Vad �r din address?");
		String Address = input.nextLine();
		
		System .out.println("Vad �r ditt postnummer?");
		String Postnummer = input.nextLine();
		
		System .out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System .out.println("Vad �r ditt telefonnummer?");
		String Telefonnummer = input.nextLine();
		System.out.println("\n");
		
		System.out.println("Ditt Namn: " + " \t " + F�rnamn);
		System.out.println("Din �lder: " + " \t " + Gammal);
		System.out.println("Din Address: " + " \t " + Address);
		System.out.println("Ditt Postnummer: " + Postnummer);
		System.out.println("Din Stad: " + " \t " + Stad);
		System.out.println("Ditt Nummer:  " + " \t " +Telefonnummer);
	}
	
}
