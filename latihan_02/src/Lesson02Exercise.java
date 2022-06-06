import java.util.Locale;

public class Lesson02Exercise
{
	public static void main(String[] args)
	{
		/* Init */		
		String name = "Keanu Reeves";
		String gender = "Laki-laki";
		int age = 57;
		float height = 1.86f;
		String format = "%1$-14s%2$-2s%3$-10s\n";
		
		System.out.printf("Info Aktor %n");
		System.out.printf("Nama: %s%n" , name);
		System.out.printf("Jenis Kelamin: %s%n" , gender);
		System.out.printf("Umur: %d tahun %n" , age);
		System.out.printf("Tinggi Badan: %f cm %n" , height);
		
		System.out.printf("%nNama saya %s, " , name);
		System.out.printf("jenis kelamin %s, " , gender);
		System.out.printf("umur %d tahun, " , age);
		System.out.printf("tinggi badan %f cm %n" , height);
		
		System.out.printf("%nInfo Aktor %n");
		System.out.printf(format,"Nama",":", name);
		System.out.printf(format,"Jenis Kelamin",":", gender);
		System.out.printf(format,"Umur",":", age + " tahun");
		System.out.printf(format,"Tinggi Badan",":",String.format(new Locale("in","ID"),"%.2f",height)+" cm");
	}
}