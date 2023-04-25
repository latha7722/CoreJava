package Com.hashcode;

public final class Myimmutable {
 private int id;
 String name;
   
 public Myimmutable(int id, String name) {
	 this.id = id;
	 this .name = name;
	 
 }
 public int get() {
	 return id;
	
 }
   public String getName() {
	return name;
}

    public String tostring() {
    	return "student [id="+id+", name ="+name+"]";
    	
   }
     public static void main(String[] args) {
    	Myimmutable dd =new Myimmutable (1,"latha");
    	System.out.println(dd);
     }
    
}
   
 