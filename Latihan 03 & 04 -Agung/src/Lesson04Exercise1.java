import java.util.Scanner;

public class Lesson04Exercise1{
    public static final char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
    public static void main(String args[]){
        int boxLenght = 17;
        int boxHeight = 6;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nProgram menghitung Keliling dan Luas Persegi Panjang\n");    
        System.out.println(createBox(boxHeight, boxLenght));

        System.out.printf("%-12s (p): ", "Sisi panjang");
        int p = Integer.parseInt(scan.nextLine());
        System.out.printf("%-12s (l): ", "Sisi lebar");
        int l = Integer.parseInt(scan.nextLine());

        System.out.printf("\nKeliling persegi panjang");
        System.out.printf("\n= 2 x (p + l)");
        System.out.printf("\n= 2 x (%d + %d)", p, l);
        System.out.printf("\n= %d cm\n", 2 * (p + l));

        System.out.printf("\nLuas persegi panjang");
        System.out.printf("\n= p x l");
        System.out.printf("\n= %d x %d", p, l);
        System.out.printf("\n= %d cm persegi\n\n", p * l);

        scan.close();
    }

    public static String createBox(int boxHeight, int boxLenght){
        String box = "";
        for(int i = 1; i <= boxHeight; i++){
            box += "\t";
            for(int j = 1; j <= boxLenght; j++){
                if(j == 1 || j == boxLenght){
                    if(i == 1 || i == boxHeight - 1){
                        box += (j == 1 ? ascii[i == 1 ? 3 : 7] : ascii[i == 1 ? 5 : 6]);                     
                    }else{
                        box += (i != boxHeight ? ascii[2] : " ");
                    }
                }else{
                    if(i == 1 || i == boxHeight - 1){
                        box += ascii[4];                     
                    }else{
                        box += (i != boxHeight ? " " : (j == (boxLenght+1)/2 ? "p" : " "));
                    }
                }
            }
            if(i == (boxHeight+1)/2) box += String.format("%3s", "l");
            box += "\n";
        }    
        return box;   
    }
}