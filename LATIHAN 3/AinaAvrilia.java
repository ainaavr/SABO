package Main.java;

public class AinaAvrilia {
	protected String nama; 
		public AinaAvrilia(String nama) {
		    this.nama = nama;
		  }

		  public void setNama(String nama) {
		    this.nama = nama; 
		  }

		  public String getNama() {
		    return nama; 
		  }

		  public static void main(String[] args) {
		    AinaAvrilia person = new AinaAvrilia ("Aina");
		    System.out.println(person.getNama());
		    person.setNama("Lia");
		    System.out.println(person.getNama());
		  }

	}