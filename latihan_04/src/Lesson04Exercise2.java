import java.util.Scanner;

public class Lesson04Exercise2
{
	public static void main(String[] args)
	{
		/* Declaration & Initialization */
	    char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514,0x0020,0x005F };
	    Scanner scanner = new Scanner(System.in);
	    String bil1, bil2;
	    double bilangan1, bilangan2;
	    
		System.out.printf("%nProgram menghitung sisi miring segitiga Siku-siku (Pythagoras)%n%n");
		
		System.out.printf("\t %c%c%c%c%c%c%c%c/%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c%c%c%c%c%c/%c%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c%c%c%c%c/%c%c%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c%c%c%c/%c%c%c%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%cc%c/%c%c%c%c%c%cb%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2],ascii[8]);
		System.out.printf("\t %c%c%c/%c%c%c%c%c%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c/%c%c%c%c%c%c%c%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c%c%c%c%c%c%c%c%c%n", ascii[8],ascii[8],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[6]);
		System.out.printf("\t %c%c%c%c%c%ca%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8]);
		
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("c = %c a%c + b%c%n",ascii[0],ascii[1],ascii[1]);
		System.out.printf("a = Sisi datar%n");
		System.out.printf("b = Sisi tegak%n");
		System.out.printf("c = Sisi miring%n%n");
		
		System.out.printf("Sisi datar %c: ",ascii[8]);
		bil1 = scanner.nextLine();
		bilangan1 = Double.parseDouble(bil1);
		System.out.printf("Sisi tegak %c: ",ascii[8]);
		bil2 = scanner.nextLine();
		bilangan2 = Double.parseDouble(bil2);
		System.out.printf("Sisi miring %n");
		
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("c = %c a%c + b%c%n",ascii[0],ascii[1],ascii[1]);
		
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("c = %c %s%c + %s%c%n",ascii[0],bil1,ascii[1],bil2,ascii[1]);
		System.out.printf("c = %.2f %n",Math.sqrt((bilangan1*bilangan1) + (bilangan2*bilangan2)));
		
		scanner.close();
	}
	
}