package abstraction_Using_Hierarchical_Inheritance;

public class Abstract_MainClass {
	
	//Concrete Class
	
	public static void main(String[] args) {
		
		Abstract_Honda p = new Abstract_Honda(); //Inheritance
		p.welcome();
		p.model();
//		p.brand();
//		p.price();
		p.m1();
		
				
		Abstract_Scooty a = new Abstract_Honda(); //Upcasting
		a.model();
		a.brand();
		a.price();
		
		Abstract_TVS q = new Abstract_TVS();
		q.model();
		q.price();
		q.ty();
		
		
		
	}

}
