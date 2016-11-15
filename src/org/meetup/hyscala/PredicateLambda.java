package org.meetup.hyscala;

import java.util.function.Predicate;

//Predicate represents a predicate, which is boolean-valued function, of one argument.


public class PredicateLambda {

	public static void main(String[] args) {
		
		// predicate testing
		
		Predicate<String> i  = (s)-> s.length() > 5;		
		System.out.println(i.test("HyScala Meetup "));
		

		
		
	}

}
