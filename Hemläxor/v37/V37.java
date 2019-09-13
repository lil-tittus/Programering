import java.util.Scanner;
public class V37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vad heter du?");
		
		String Förnamn = input.nextLine();
		System.out.println(Förnamn);
		
	
		System.out.println("Hur gammal är du?");
		String gammal = input.nextLine();
		
		System.out.println("Vad är din address?");
		String Adress = input.nextLine();
		
		System .out.println("Vad är ditt postnummer?");
		String Postnummer = input.nextLine();
		
		System .out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System .out.println("Vad är ditt telefonnummer?");
		String Telefonnummer = input.nextLine();
	}
	
}
