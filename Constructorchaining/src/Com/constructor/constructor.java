package Com.constructor;

public class constructor {
  
	public void area(double ar) {
//		double formulaOfArea = ar * ar * ar * ar;
		final double area = Math.pow(ar,4);
		System.out.println("area of square: " + area);
//		System.out.println("area of square: " + formulaOfArea);
		
		
	}
	
	public double area(double length, double width) {
          double areaOfRectangle = length * width;
          return areaOfRectangle;

	}
	
	public double area(float radius) {
		double area= Math.PI*(radius*radius);
		return area;
		
		
	}
	public float area(float base, float height) {
		float area = 1/2*( base* height);
		return area;
	}
	public static void main(String[] args) {
		constructor Square = new constructor();
		Square.area(3);
		constructor Rectangle = new constructor();
		Rectangle.area(30.00, 50.00);
		constructor Circle = new constructor();
		Circle.area(40.f);
		constructor Triangle = new constructor();
		Triangle.area(50.f, 60.f);
	}
	
	
	
}
