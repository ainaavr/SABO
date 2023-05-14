package informatika;
import java.util.Scanner;

public class AinaAvriliaImani {
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Masukkan nilai x: ");
	int nilai = input();
	System.out.print("Hasil : ");
	Penjumlahan(nilai); 
		
	System.out.print("Masukkan nilai x: ");
	int x =	input();
	System.out.print("Masukkan nilai y: ");
	int y = input();
	System.out.print("Hasilnya : ");
	Perkalian(x,y);
	
	System.out.print("");
	Backwards();
		
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		return in; 
	}
	
	static void resetp() {
		a=0;
	}
	
	static void Penjumlahan(int input) {
	resetp();
	int angka = 0;
	for (int i =0;i<input+1;i++) {
		a=a+1;
		angka = angka +i+1;
		if(i==input-1)  {
				
	System.out.print(a+"=" +angka);		
		}
	else if(i<input) {
	System.out.print(a+ "+");
		}
	}
		
	System.out.println();System.out.println();
		}
	
	static void Perkalian(int input1,int input2) {
	resetp();
	a = input1*input2;
	System.out.print(input1 +" * "+input2 + " = ");
	for(int i=0;i<input2;i++) {
		if(i==input2-1)  {
			System.out.print(input1+" = " +a);		
	}
		else if(i<input2) {
			System.out.print(input1+ " + ");
			}
		}
	}

	static void Backwards() {System.out.println();
	System.out.println();
	System.out.print("Masukkan nilai n: ");
		int hit = input(); 
		
		String numStr= Integer.toString(hit);
		char[] numChar = numStr.toCharArray();
		int deretAngka = numStr.length();
		for (int i =0;i<deretAngka;i++) {
			System.out.print(numChar[deretAngka-i-1]);
		}
	}
}
