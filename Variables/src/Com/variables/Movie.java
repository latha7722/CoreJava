package Com.variables;

public class Movie {
String movie;
String Director;
int relesdate;
int budject;


 public void moviedetails(){
	System.out.println("moviename:" +movie);
	System.out.println("directorname:" +Director);
	System.out.println("relesdate:" +relesdate);
	System.out.println("budject:" +budject);
 }
 public static void main(String[] args) {
	
         Movie details = new Movie ();
         details.movie="happy";
         details.Director="devi sri prasad";
         details.relesdate=05032023;
         details.budject=10000000;
         
         details.moviedetails();
         
         
         


}


}
