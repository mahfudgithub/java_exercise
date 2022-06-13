import java.util.Locale;

public class Lesson02Exercise{
    public static void main(String args[]){
        String name = "Keanu Reeves";
        String gender = "Laki-laki";
        int age = 57;
        double height = 1.86;
        
        title();
        System.out.printf("Nama: %s\n", name);
        System.out.printf("Jenis Kelamin: %s\n", gender);
        System.out.printf("Umur: %d\n", age);
        System.out.printf("Tinggi Badan: %f cm\n\n", height);

        System.out.printf("Nama saya %s, jenis kelamin %s, umur %d, tinggi badan %f cm \n", name, gender, age, height);

        title();
        System.out.printf("%-14s : %s\n", "Nama", name);
        System.out.printf("%-14s : %s\n", "Jenis Kelamin", gender);
        System.out.printf("%-14s : %d\n", "Umur", age);
        System.out.printf(new Locale("in", "ID"), "%-14s : %,.2f cm\n\n", "Tinggi Badan", height);
    }

    public static void title(){
        System.out.printf("\nInfo Aktor\n");
        System.out.println("===============================");
    }
}