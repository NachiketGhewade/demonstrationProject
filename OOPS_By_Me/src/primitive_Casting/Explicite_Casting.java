package primitive_Casting;

public class Explicite_Casting {

	public void m1() {
		int a = 32542;
		short b =(short)a;
		System.out.println(b);
		
		long p = -32769;
		short q = (short)p;
		System.out.println(q);
		
		double d = 32.5;
		float e = (float)d;
		System.out.println(e);
	}
	public static void main(String[] args) {
		Explicite_Casting k = new Explicite_Casting();
		k.m1();
	}
}
