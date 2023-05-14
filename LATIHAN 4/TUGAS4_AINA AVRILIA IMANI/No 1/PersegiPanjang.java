package informatika;
import java.util.Scanner;

public class PersegiPanjang extends AinaAvrilia{
	public void PersegiPanjang(){
		 double p,l,luas,keliling;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("===============");
		 System.out.println("=Persegi Panjang=");
		 System.out.println("===============");
		 
		 System.out.print("Masukkan Panjang : ");
		 p = input.nextDouble();
		 
		 System.out.print("Masukkan Lebar : ");
		 l = input.nextDouble();
		 
		 luas = p*l;
		 keliling = 2*(p+l);
		 System.out.println("---------------------------------");
		 System.out.println("Luas Persegi Panjang adalah : "+luas);
		 System.out.println("Keliling Persegi Panjang adalah : "+keliling);
	}

}
