package informatika;
import java.util.Scanner;

public class Segitiga extends AinaAvrilia{
	public void Segitiga() {
		double luas,keliling,alas,tinggi,sisi;
		Scanner input = new Scanner(System.in); 
		 System.out.println("=========="); 
		 System.out.println("=SEGITIGA= ");
		 System.out.println("==========");
		 System.out.println();
		 
		 System.out.print ("Masukkan alas : "); 
		 alas = input.nextDouble(); 
		 
		 System.out.print ("Masukkan tinggi :"); 
		 tinggi = input.nextDouble(); 
		 
		 System.out.print ("Masukkan sisi : "); 
		 sisi = input.nextDouble();
		 
		 luas = (alas*tinggi)/2; 
		 keliling = (sisi*2)+alas;
		 
		 System.out.println("----------------------------------"); 
		 System.out.println("Luas Segitiga adalah : "+luas); 
		 System.out.println("Keliling Segitiga adalah : "+keliling);
	}

}
