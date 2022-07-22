package run_Time_Polymorphism;

public class Hotel_Main {

	public static void main(String[] args) {

		Hotel_Jagdamba.sb();
		Hotel_Torna.sb();

		Hotel_Torna t = new Hotel_Torna();
		t.nonveg();
		t.nonveg();
		t.veg();
		t.veg();

		Hotel_Jagdamba p = new Hotel_Jagdamba();
		p.nonveg();
	}
}
