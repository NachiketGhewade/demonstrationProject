package Compile_Time_Polymorphism;

public class Compile_Time {

	public void info() {
		System.out.println("Hello Guys");
	}
		
		public void info(String name) {
			System.out.println(name);
		}
			
			public void info(String address, int age) {
				System.out.println("Address = " + address + "\n " + "age = " + age);
				
			}
			
			public static void main(String[] args) {
				
			Compile_Time t = new Compile_Time();
			t.info();
			t.info("Snehal Borkar");
			t.info("A/P-Kuruli, Tal-Shirur,Dist-Pune", 26);
			
			}
			
}
