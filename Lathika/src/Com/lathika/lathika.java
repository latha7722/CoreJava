package Com.lathika;

public class lathika {
 public static void main(String[] args) {
	int number=121;
	int m=0;
	for (int i = 1;i<=number;i++) {
		if (number%i==0) {
			m++;
		}
		if(m==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
			
 

  int A=7;
  for (int i=1; i<=13;i++) {
	  System.out.println(A+"*" +i+ "=" +number *i);
	  
  }
 }
	
	  
  }