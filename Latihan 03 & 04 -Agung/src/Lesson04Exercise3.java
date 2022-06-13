import java.util.Scanner;

public class Lesson04Exercise3 {
    public static final char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
    public static void main(String args[]){
        
        System.out.println("\nProgram persamaan kuadrat");
        System.out.printf("\nax%c +bx + c = 0\n", ascii[1]);

        printFormula("+", "x1");
        printFormula("-", "x2");

        System.out.println("\nIsi nilai a, b, dan c");
        Scanner scan = new Scanner(System.in);

        System.out.printf("a: ");
        String a = scan.nextLine();
        System.out.printf("b: ");
        String b = scan.nextLine();
        System.out.printf("c: ");
        String c = scan.nextLine();

        printFormula("+", "x1", a, b, c);
        double calc1 = (-Integer.parseInt(b) + Math.sqrt(Double.parseDouble(b) * Double.parseDouble(b) - 4 * Integer.parseInt(a) * Integer.parseInt(c))) / 2 * Integer.parseInt(a);
        System.out.printf("x1 = %.2f\n\n", calc1);

        printFormula("-", "x2", a, b, c);
        double calc2 = (-Integer.parseInt(b) - Math.sqrt(Double.parseDouble(b) * Double.parseDouble(b) - 4 * Integer.parseInt(a) * Integer.parseInt(c))) / 2 * Integer.parseInt(a);
        System.out.printf("x2 = %.2f\n\n", calc2);

        scan.close();
    }

    public static void printFormula(String operator, String variable){
        System.out.printf("%10s %s\n", "", "_".repeat(10));
        System.out.printf("%4s -b "+ operator +" %c b%c - 4ac \n", "", ascii[0], ascii[1]);
        System.out.printf("%s = %s\n", variable, Character.toString(ascii[4]).repeat(16));
        System.out.printf("%14s\n", "2a");
    }

    public static void printFormula(String operator, String variable, String a, String b, String c){
        System.out.printf("%10s %s %7s %s\n", "", "_".repeat(10), "", "_".repeat(16));
        System.out.printf("%4s -b "+ operator +" %c b%c - 4ac %2s -%s "+ operator +" %c %s%c - 4 x %s x %s \n", "", ascii[0], ascii[1], "", b, ascii[0], b, ascii[1], a, c);
        System.out.printf("%s = %s = %s\n", variable, Character.toString(ascii[4]).repeat(16), Character.toString(ascii[4]).repeat(22));
        System.out.printf("%14s %16s 2 x %s\n", "2a", "", a);
    }
}
