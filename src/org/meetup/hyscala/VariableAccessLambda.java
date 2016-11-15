package org.meetup.hyscala;

//This is another basic level code showing how we can access 
//the local and class level variables in a lambda expression.
//Also note how we have passed reference for the Runnable.



public class VariableAccessLambda {

	public String human_india = "Mallik";
	
	
	
	public void lambdaExpression(){
        String human_other = "IlichIlanove";
        
        new Thread (() -> {
            System.out.println("Class Level: " + this.human_india);
        	System.out.println("Method Level: " +human_other);
       }).start(); 

}
	
	public static void main(String[] args) {
		new VariableAccessLambda().lambdaExpression();
		
	}
		

}
