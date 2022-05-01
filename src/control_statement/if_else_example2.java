package control_statement;

public class if_else_example2 {

	
	public static void main(String[] args) {
		 
	String Username = "ABC";
	String Password = "XYZ";
	String Captcha = "abc123";
	
	if ("ABC" == Username && "XYZ" == Password &&  "abc123" == Captcha) 
	{
		System.out.println("login successfully");
	}
	else {
		System.out.println("login failed");
	}
	}
}