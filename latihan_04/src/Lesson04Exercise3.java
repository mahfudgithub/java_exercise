import java.util.Scanner;

public class Lesson04Exercise3
{
	public static void main(String[] args)
	{
		/* Declaration & Initialization */
	    char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514,0x0020,0x005F };
	    Scanner scanner = new Scanner(System.in);
	    String bil1, bil2, bil3;
	    double bilangan1, bilangan2, bilangan3;
	    
	    System.out.printf("%nProgram persamaan kuadrat%n%n");
		
		System.out.printf("ax%c + bx + c = 0%n",ascii[1]);
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("%c%c%c%c -b + %c b%c - 4ac%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[0],ascii[1]);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4]);
		System.out.printf("\t %c%c%c2a%n", ascii[8],ascii[8],ascii[8]);
		
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("%c%c%c%c -b - %c b%c - 4ac%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[0],ascii[1]);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4]);
		System.out.printf("\t %c%c%c2a%n", ascii[8],ascii[8],ascii[8]);
		System.out.printf("%nProgram persamaan kuadrat%n%n");
		
		System.out.printf("Isi nilai a, b dan c%n");
		System.out.printf("a %c: ",ascii[8]);
		bil1 = scanner.nextLine();
		bilangan1 = Double.parseDouble(bil1);
		System.out.printf("b %c: ",ascii[8]);
		bil2 = scanner.nextLine();
		bilangan2 = Double.parseDouble(bil2);
		System.out.printf("c %c: ",ascii[8]);
		bil3 = scanner.nextLine();
		bilangan3 = Double.parseDouble(bil3);
		
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c         %c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("%c%c%c%c -b + %c b%c - 4ac   -%s + %c%s%c - 4 x %s x %s%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[0],ascii[1],bil2,ascii[0],bil2,ascii[1],bil1,bil3);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c= %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[8],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4]);
		System.out.printf("\t %c%c%c2a\t %c%c%c           2 x %s%n", ascii[8],ascii[8],ascii[8], ascii[8],ascii[8],ascii[8],bil1);
		System.out.printf("x1 = %.2f %n",(-bilangan2 + (Math.sqrt((bilangan2*bilangan2) - (4*bilangan1*bilangan3))))/ 2*bilangan1);
		
		System.out.printf("%n%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c         %c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[8],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9],ascii[9]);
		System.out.printf("%c%c%c%c -b + %c b%c - 4ac   -%s - %c%s%c - 4 x %s x %s%n",ascii[8],ascii[8],ascii[8],ascii[8],ascii[0],ascii[1],bil2,ascii[0],bil2,ascii[1],bil1,bil3);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c= %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n",ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[8],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4],ascii[4]);
		System.out.printf("\t %c%c%c2a\t %c%c%c           2 x %s%n", ascii[8],ascii[8],ascii[8], ascii[8],ascii[8],ascii[8],bil1);
		System.out.printf("x2 = %.2f %n",(-bilangan2 - (Math.sqrt((bilangan2*bilangan2) - (4*bilangan1*bilangan3))))/ 2*bilangan1);
		/*
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
		*/
		scanner.close();
		    /* Declaration & Initialization */
		    /*System.out.printf("%n%n0x221A %c%n", ascii[0]);
		    System.out.printf("0x00B2 %c%n", ascii[1]);
		    System.out.printf("0x2502 %c%n", ascii[2]);
		    System.out.printf("0x250C %c%n", ascii[3]);
		    System.out.printf("0x2500 %c%n", ascii[4]);
		    System.out.printf("0x2510 %c%n", ascii[5]);
		    System.out.printf("0x2518 %c%n", ascii[6]);
		    System.out.printf("0x2514 %c%n", ascii[7]);
		    System.out.printf("0x0020 %c%n", ascii[9]);*/
		    
		    
		    
		    /*double nilai = 16, akarPangkat2 = 0;
		    
		    akarPangkat2 = Math.sqrt(nilai);
		    System.out.printf("%nAkar pangkat 2 dari %.0f adalah %.0f%n", nilai, akarPangkat2);*/
		    
		/* Declaration & Initialization */
	    /*Scanner scanner = new Scanner(System.in);
			String bil1, bil2;
	    int bilangan1, bilangan2;*/
	    
			
	    /* Read Bilangan 1 from keyboard */
	    /*System.out.printf("Bilangan ke-1: ");
	    bil1 = scanner.nextLine();
	    bilangan1 = Integer.parseInt(bil1);
	    //System.out.printf("Bilangan ke-1 adalah %s", bil1);

	    /* Read Bilangan 2 from keyboard */
	    /*System.out.printf("%nBilangan ke-2: ");
	    bil2 = scanner.nextLine();
	    bilangan2 = Integer.parseInt(bil2);
	    //System.out.printf("Bilangan ke-2 adalah %s%n", bil2);
	    
	    System.out.printf("%s + %s = %s%n", bil1, bil2, bil1 + bil2);
	    System.out.printf("%d + %d = %d%n", bilangan1, bilangan2, bilangan1 + bilangan2);
	    
	    scanner.close();*/
	}
	
}