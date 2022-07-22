package abstraction_UsingMultiLevel_Inheritance;

public class Abstract_MainClass {
	public static void main(String[] args) {
		
	
	Education_Details t = new Education_Details();
	t.loginID();
	t.password();
	t.ssc_Percentage();
	t.diploma_Percentage();
	
	Abstract_Exam_Form p = new Education_Details();
	p.name();
	p.mailID();
	
	Personal_Details r = new Education_Details();
	r.mobno();
	r.name();
	r.mailID();
	

}
}