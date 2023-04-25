package Com.variables;

public class varibales {
 
	int id;
	String firstname;
	String lastname;
	static char gender = 'f';
	static String address = "ramagundam";
	long phonenum;
	
	
	public void customerdetails () {
		System.out.println("customer id number:" +id);
		System.out.println("customer firstname:"  +firstname);
		System.out.println("customer lastname: "+lastname);
		System.out.println("customer gender: "+gender);
	    System.out.println("customer address:"+address);
	    System.out.println("customer phonenum:" +phonenum);
	    
	    
	}
	public static void main(String[] args) {
		varibales details = new varibales();
		details.id=10;
		details.firstname="gummula";
		details.lastname="latha";
		details.gender='f';
		details.address="ramagundam";
		details.phonenum=756982;
		
		
		details.customerdetails();
		
		
		
		
		
		
		
		
	}
	
	    
	    
	    
}
