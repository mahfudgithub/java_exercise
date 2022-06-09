import java.util.Scanner;

public class Lesson04Exercise1
{
	public static void main(String[] args)
	{
		/* Declaration & Initialization */
	    char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514,0x0020 };
	    Scanner scanner = new Scanner(System.in);
	    String bil1, bil2;
	    int bilangan1, bilangan2;
	    String fKel = "2 x (p + l)";
	    String fluas = "p x l";
	    
		System.out.printf("%nProgram menghitung Keliling dan Luas Persegi Panjang%n%n");
		
		System.out.printf("\t %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[3],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[5]);
		System.out.printf("\t %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[2],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2]);
		System.out.printf("\t %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%cl%n", ascii[2],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[2],ascii[8],ascii[8]);
		System.out.printf("\t %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[7],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[6]);
		System.out.printf("\t %c%c%c%c%c%c%cp%n", ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8]);
		
		System.out.printf("%nSisi panjang %c(p): ",ascii[8]);
		bil1 = scanner.nextLine();
		bilangan1 = Integer.parseInt(bil1);
		System.out.printf("Sisi lebar %c%c%c(l): ",ascii[8],ascii[8],ascii[8]);
		bil2 = scanner.nextLine();
		bilangan2 = Integer.parseInt(bil2);
		
		System.out.printf("%nKeliling persegi panjang%n");
		System.out.printf("= %s%n",fKel);
		System.out.printf("= 2 x (%s + %s)%n",bil1,bil2);
		System.out.printf("= %d cm%n",2*(bilangan1+bilangan2));
		
		System.out.printf("%nLuas persegi panjang%n");
		System.out.printf("= %s%n",fluas);
		System.out.printf("= %s x %s%n",bil1,bil2);
		System.out.printf("= %d cm persegi%n",bilangan1*bilangan2);
		
		scanner.close();
	}
	
}