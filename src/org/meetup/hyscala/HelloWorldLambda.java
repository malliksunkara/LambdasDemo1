package org.meetup.hyscala;

public class HelloWorldLambda {

	interface HelloWorld {
		String hello(String name);
	}
	
	public static void main(String[] args) {
		HelloWorld helloWorld = (String name) -> { return "Hello " + name; };
		 System.out.println(helloWorld.hello("Hyderabad"));

	}

}
