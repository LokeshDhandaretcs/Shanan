package String_Class;

public class String_method {
public static void main(String[] args) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="city";
	
	//lenght()
	System.out.println(s1.length());//8
	
	//toUppercase()
	System.out.println(s1.toUpperCase());//VELOCITY
	
	//toLowerCase
	System.out.println(s1.toLowerCase());//velocity
	
	//equals()
	System.out.println(s1.equals(s2));//false
	
	//equalignoreCase
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//contain
	System.out.println(s1.contains(s3));//true
	
	System.out.println(s2.contains(s3));//false
	//charAt
	System.out.println(s1.charAt(7));//y
	
	//indexof()
	System.out.println(s1.indexOf("y"));//7
	
	//concat()
	System.out.println(s1.concat(s2));//velocitycity
	
	//substring
	System.out.println(s1.substring(4));//city
	
	//startsWith()
	System.out.println(s1.startsWith("ve"));//true
	
	//endsWith
	System.out.println(s2.endsWith("TY"));//true
	System.out.println(s1.endsWith("ve"));//false
	
	
	
	
	
			
			
}
}
