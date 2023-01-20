package Variable_types;

public class Global_local_variable {//class body open
	
	static int j=10;//it outside the main method hence it is called as global variable
	
	public static void main(String[] args) {//main method body open
		int i=20;//it is inside the main method hence it is called as local variable

		System.out.println(j);
		System.out.println(i);
		
		
		
	}//main method body closed

}//class body closed
