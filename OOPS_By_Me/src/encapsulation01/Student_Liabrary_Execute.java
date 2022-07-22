package encapsulation01;

public class Student_Liabrary_Execute {
	
	public static void main(String[] args) {
		Student_Liabrary a = new Student_Liabrary();
		a.setname("Snehal Borkar");
		a.setmobno(1234567890L);
		a.setliabraryNo(455);
		
		String name = a.getname();
		double mobno = a.getmobno();
		int liabraryNo = a.getliabraryNo();
		
		System.out.println("Student name = " + name + "\n" + "Mob No = " + mobno + "\n" + "Liabrary No = " + liabraryNo);
	}

}
