package control_statement;

public class switch_statement {
	
public static void main(String[] args) {
	
	String action  = "PC";
	
	switch (action) 
	{
	    case "CD" : System.out.println("user able to deposit cash");
	break;
	
	    case "CW" : System.out.println("user able to withrdraw cash");
	break;
	
	    case "BI" : System.out.println("user able to balance inquiry");
	break;

	    case "PC" : System.out.println("user able to change pin");
	break;
	
	
	default: System.out.println("wrong input");
		break;
	}
	
}

}
