package control_statement;

public class nested_if {
	public static void main(String[] args) {
		 String UN =  "ABC";
		 String PW =  "XYZ";
		 
		 if ("ABC" == UN) 
		 {
			System.out.println("username is correct.... enter password");
			
			if ("XYZ" == PW) 
			{
			 System.out.println("login successfully");	
			}
			else {
				System.out.println("wrong password.. login again with valid password");
			}
		 }
		 else {
			System.out.println("wrong username");
		}
	}

}
