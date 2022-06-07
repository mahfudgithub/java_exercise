import java.util.Locale;

public class Lesson02Exercise
{
  public static void main(String args[])
  {
	/* Declaration */
    String name, gender;
	
	/* Declaration & Initialization */
	int age = 39;
	float height = 1.68f;
	
	/* Assignment */
	name = "Iko Uwais";
	gender = "Laki-laki";
    
    System.out.printf("Info Aktor%n");
	System.out.printf("Nama : %s%n", name);
	System.out.printf("Jenis Kelamin : %s%n", gender);
	System.out.printf("Umur : %d tahun %n", age);
	System.out.printf("Tinggi Badan : %f cm %n%n", height);
	
	System.out.printf("Nama saya %s, jenis kelamin %s, umur %d tahun, tinggi badan %f cm %n%n", name, gender, age, height);
	
	System.out.printf("Info Aktor%n");
	System.out.printf("Nama \t\t : %s%n", name);
	System.out.printf("Jenis Kelamin \t : %s%n", gender);
	System.out.printf("Umur \t\t : %d tahun %n", age);
	System.out.printf(new Locale("in", "ID"), "Tinggi Badan \t : %.2f cm %n", height);
  }
}