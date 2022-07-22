package primitive_Casting;

public class Implicite_Casting {

	public void s1() {
		int p = -128;
		int q = p;
		System.out.println(q);
		int r = q;
		System.out.println(r);
	}
	
	public static void main(String []args) {
		Implicite_Casting t = new Implicite_Casting();
		t.s1();
	}
}
