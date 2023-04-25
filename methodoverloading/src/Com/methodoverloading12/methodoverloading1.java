package Com.methodoverloading12;

public class methodoverloading1 {
	
  int id;
  String name;
  double salary;
  
  public void m1(int id) {
	 // this.id=id;
	  System.out.println(id);
  }
  
  
  public void m1(int id,String name) {
	  System.out.println(id);
	  System.out.println(name);
	  
  }
  
  
  
  public void m1(int id,String name,double salary){
	 System.out.println(id); 
	 System.out.println(name);
	 System.out.println(salary);
	 
  }
  
  
 public static void main(String[] args) {
	
	 methodoverloading1 abd=new methodoverloading1();
	 abd.m1(1, "asd");
	 abd.m1(101);

	
}

}	  
	  
	
