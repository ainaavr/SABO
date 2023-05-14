package informatika;
import java.util.Scanner;

public class BujurSangkar extends AinaAvrilia {

	public void BujurSangkar() {
		
		double s,luas,keliling;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("===============");
		 System.out.println("=BUJUR SANGKAR=");
		 System.out.println("===============");
		 
		 System.out.print("Masukkan sisi : ");
		 s = input.nextDouble(); 
		 
		 luas = s*s;
		 keliling = 4*s;
		 System.out.println("---------------------------------");
		 System.out.println("Luas Bujur Sangkar adalah : "+luas);
		 System.out.println("Keliling Bujur Sangkar adalah : "+keliling);

		
	}

}
