package This_Keyword;

public class Keyword02 extends Keyword01 {


	int p = 30;
	int q = 10;

	public void m2() {
		int c = p + q;
		int d = super.p + super.q;
		System.out.println(c);
		System.out.println(d);

	}

	public static void main(String[] args) {
		Keyword02 r = new Keyword02();
		r.m2();
	}

}
