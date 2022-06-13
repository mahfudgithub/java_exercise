import java.util.Scanner;

public class Lesson04Exercise2 {
    public static final char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
    public static void main(String args[]){
        int length = 8;

        System.out.println("\nProgram menghitung sisi miring segitiga siku-siku (Pythagoras)\n");
        System.out.println(createTriangle(length));

        printSquareRoot("a", "b");
        System.out.println("a = Sisi datar");
        System.out.println("b = Sisi tegak");
        System.out.println("c = Sisi miring\n");

        Scanner scan = new Scanner(System.in);

        System.out.printf("Sisi datar : ");
        String datar = scan.nextLine();
        System.out.printf("Sisi tegak : ");
        String tegak = scan.nextLine();
        System.out.println("Sisi miring");

        printSquareRoot("a", "b");
        printSquareRoot(datar, tegak);

        double calc = Math.sqrt((Double.parseDouble(datar) * Double.parseDouble(datar)) + (Double.parseDouble(tegak) * Double.parseDouble(tegak)));
        System.out.printf("c = %.2f\n\n", calc);

        scan.close();
    }

    public static String createTriangle(int length){
        String triangle = "";
        for(int j = length; j >= 2; j--){
            if(j != 2){
                if(j != (length+2)/2){
                    triangle += String.format("%"+ Integer.toString(j) +"s%"+ Integer.toString((length - j) + 1) +"c\n", "/", ascii[2]);
                }else{
                    triangle += String.format("c%"+ Integer.toString(j-1) +"s%"+ Integer.toString((length - j) + 1) +"c%2s\n", "/", ascii[2], "b");
                }
            }else{
                triangle += String.format("%2s", "");
                for(int i = j; i <= length; i++){
                    triangle += String.format("%c", (i == length ? ascii[6] : ascii[4]));
                }
            }
        }
        triangle += String.format("\n%"+ (length-2) +"s", "a");
        return triangle;
    }

    public static void printSquareRoot(String a, String b){
        System.out.printf("%4s %s\n", "", "_".repeat(8));
        System.out.printf("c = %c %s%c + %s%c \n", ascii[0], a, ascii[1], b, ascii[1]);
    }
}
