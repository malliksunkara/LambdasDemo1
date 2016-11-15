package org.meetup.hyscala;


//Those anonymous class implementations itself are passed as argument to another generic method, 
//thus achieving a level of generic function.

public class FunctionArgumentLambda {
		
	
	interface Circle {
		double get(double radius);
	}
	
	public double circleOperation(double radius, Circle c) {
		return c.get(radius);
	}

	public static void main(String args[]){
		FunctionArgumentLambda reference = new FunctionArgumentLambda();
		Circle circleArea = (r) -> Math.PI * r * r;
		Circle circleCircumference = (r) -> 2 * Math.PI * r;
		
		double area = reference.circleOperation(10, circleArea);
		double circumference = reference.circleOperation(10, circleCircumference);
	
		System.out.println("Area: "+area+" . Circumference: "+circumference);
	}
}
