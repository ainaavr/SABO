package informatika;

public class HargaBarang {
	 public static void main(String[] args){

	        int total_harga;

	        Barang brg1 = new Barang();
	        brg1.setNama("Beras");
	        brg1.setStoc(15);
	        brg1.setHarga_satuan(12000);
	        brg1.setHarga(10, 12000);
	        int a=brg1.getHarga();

	        Barang brg2 = new Barang();
	        brg2.setNama("Telur");
	        brg2.setStoc(40);
	        brg2.setHarga_satuan(27000);
	        brg2.setHarga(14, 27000);
	        int b=brg2.getHarga();

	        Barang brg3 = new Barang();
	        brg3.setNama("Minyak Goreng");
	        brg3.setStoc(30);
	        brg3.setHarga_satuan(17000);
	        brg3.setHarga(16, 17000);
	        int c=brg3.getHarga();

	        System.out.println("\nNama Sembako = " +brg1.getNama());
	        System.out.println("Stoc            = " +brg1.getStoc());
	        System.out.println("Harga Satuan    = Rp. " +brg1.getHarga_satuan());
	        System.out.println("Harga           = Rp. " +brg1.getHarga());

	        System.out.println("\nNama Sembako = " +brg2.getNama());
	        System.out.println("Stoc            = " +brg2.getStoc());
	        System.out.println("Harga Satuan    = Rp. " +brg2.getHarga_satuan());
	        System.out.println("Harga           = Rp. " +brg2.getHarga());

	        System.out.println("\nNama Sembako = " +brg3.getNama());
	        System.out.println("Stoc            = " +brg3.getStoc());
	        System.out.println("Harga Satuan    = Rp. " +brg3.getHarga_satuan());
	        System.out.println("Harga           = Rp. " +brg3.getHarga());

	        total_harga = a+b+c;
	        System.out.println("\nTotal Harga     = Rp. " +total_harga);
	    }

	}