package org.meetup.hyscala;


import java.util.Arrays;

//In this example the key is we are passing a method reference to another method call. 
//The comparator implementation is passed to Arrays.sort as argument.

class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	public static int animalCompare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}
	
	public String toString() {
		return name;
	}
}


public class ExpressionSortLambda {

	public static void main(String[] args) {
		Animal[] animalArr = {
        		new Animal("Lion"), 
        		new Animal("Crocodile"), 
        		new Animal("Tiger"), 
        		new Animal("Elephant")};
        
        System.out.println("Before Sort: "+Arrays.toString(animalArr));
        Arrays.sort(animalArr, Animal::animalCompare);  //method references
        System.out.println("After Sort: "+Arrays.toString(animalArr));

	}

}
