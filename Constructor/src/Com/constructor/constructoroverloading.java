package Com.constructor;

public class constructoroverloading {
	
   int id;
   String firstname;
   String lastname;
   static String address="Ramagundam";
   static long Phonenum=7569820;
   
     static {
    	 System.out.println("address:" +address);
    	 
    
   }
     
     
    public String getlastName(String lastname) {
    	return this .lastname=lastname;
    	
    }
    public void displayconstructor() {
    	System.out.println("customer id");
    	System.out.println("customer firstname:"+firstname);
    	System.out.println("customer lastname:"+lastname);
    	System.out.println("customer address:"+address);
    	System.out.println("customer phonenum:"+Phonenum);
    	
    }
    
    public static void main(String[] args) {
		
    	constructoroverloading details = new constructoroverloading();
    	details.id = 888;
    	details.firstname= "Gummula";
    	details.lastname="latha";
    	System.out.println(details.getlastName("latha"));
    	details.displayconstructor();
    	
    	
	}
    
    
   
   
}
