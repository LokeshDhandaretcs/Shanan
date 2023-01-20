package Method_overriding;

public class Overriding {//ulc
	public static void main(String[] args) {
		Cat ref=new Cat();
		
		Dog d= new Dog();
		d.talk();//Bhow Bhow			
        ref.talk();//Mew Mew
	}
}
        