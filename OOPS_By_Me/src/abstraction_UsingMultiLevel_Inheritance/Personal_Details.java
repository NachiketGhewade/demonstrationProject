package abstraction_UsingMultiLevel_Inheritance;

public abstract class Personal_Details extends Abstract_Exam_Form {

	
	public void name() {
		System.out.println("Snehal Borkar");
	}

	
	public void mailID() {
		System.out.println("snehalborkar123@gmail.com");
		}
	
	abstract public void ssc_Percentage();
	abstract public void diploma_Percentage();
	
	public void mobno() {
		System.out.println("1234567890");
	}
	
	
	

}
