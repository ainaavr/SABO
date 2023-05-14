package informatika;
import java.util.Scanner;

public class AinaAvrilia {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int pil;
		 Lingkaran LING = new Lingkaran();
		 Segitiga SEG = new Segitiga();
		 BujurSangkar BS = new BujurSangkar();
		 PersegiPanjang PP = new PersegiPanjang();
		 
		 Scanner input = new Scanner(System.in);
		 
		 for (String x="y"; x.equals("y")||x.equals("y");) {
		 System.out.println("============================="); 
		 System.out.println(" MENGHITUNG LUAS BANGUN DATAR "); 
		 System.out.println("============================="); 
		 System.out.println("Input Nomor Pilihan Anda untuk Menghitung Bangun Datar ");
		 System.out.println("--------------------------------------------------------");
		 System.out.println("1. Segitiga");
		 System.out.println("2. Bujur Sangkar "); 
		 System.out.println("3. Lingkaran"); 
		 System.out.println("4. Persegi Panjang");
		 System.out.println("5. Keluar");
		 System.out.println(" ");
		 
		 System.out.print("Pilihan : ");
		 
		 pil = input.nextInt();
		 switch(pil) {
		 case 1 : SEG.Segitiga();break;
		 case 2 : BS.BujurSangkar();break;
		 case 3 : LING.Lingkaran();break;
		 case 4 : PP.PersegiPanjang();break;
		 case 5 : System.exit(0);
		 }
		 
		 System.out.println();
		 }
		}

	}
