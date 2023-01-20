package Exception;

public class Finally_Block {

	public static void main(String[] args) {
		
		        int a=1;
				int b=0;
				
				try {
					System.out.println(a/b);
					
				}
		catch (Throwable d){
			System.out.println("hii");
			
				}
		finally {
			System.out.println("thank you");
			
		}
	}
	
	
}
