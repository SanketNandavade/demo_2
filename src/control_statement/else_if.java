package control_statement;

public class else_if {
public static void main(String[] args) {
	 int marks = 15;
	 
	 if (marks >= 75)
	 {
		 System.out.println("passed with distiction");
	 }
	
	 else if (marks >= 60)
	 {
		System.out.println("passed with first class");
	 }
	 else if (marks >= 55)
	 {
	    System.out.println("passed with higher second class");	
	 }
	 
	 else if (marks >= 50)
	 {
	    System.out.println("passed with second class");	
	 }
	 
	 else if (marks >= 35) 
	 {
	    System.out.println("pass");	
	 }
	 else if (marks < 35) 
	 {
		 System.out.println("fail");

	 }
}
}
