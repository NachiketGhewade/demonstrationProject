package encapsulation01;

import java.util.Scanner;

public class Encapsulation_Main_ScannerClass {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		Encapsulation_Using_ScannerClass t = new Encapsulation_Using_ScannerClass();

		System.out.println("Enter Your Name");
		t.setname(m.nextLine());
		String name = t.getname();
		System.out.println("Your name is = " + name);

		System.out.println("Enter Your MobNo");
		t.setmobNo(m.nextDouble());
		double mobNo = t.getmobNo();
		System.out.println("Your name is = " + mobNo);

		System.out.println("Enter Your LiabraryNo ");
		t.setliabraryNo(m.nextInt());
		int liabraryNo = t.getliabraryNo();
		System.out.println("Your name is = " + liabraryNo);

		m.close();
	}

}
