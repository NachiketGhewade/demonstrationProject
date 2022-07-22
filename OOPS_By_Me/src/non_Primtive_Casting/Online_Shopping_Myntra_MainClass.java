package non_Primtive_Casting;

public class Online_Shopping_Myntra_MainClass {

	public static void main(String[] args) {

		//Inheritance
		Myntra t = new Myntra();
		t.Kurta_Plazzo();
		t.Saree();
		
		//UpCasting
		Online_Shopping m = new Myntra();
		m.Kurta_Plazzo();
		
		//Down Casting Object
		Online_Shopping p = new Myntra();
		Myntra f = (Myntra)p;
		f.Kurta_Plazzo();
		f.Saree();
	}

}
