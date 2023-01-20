package Hierarchical_inheritance;

public class Hierarchical {// Ulc
	public static void main(String[] args) {
	
		
		Son l=new Son();
		l.home();
		l.car();
		l.money();
		l.laptop();
		System.out.println("proprties of son class");
		System.out.println(l);
		
		Son_two m=new Son_two();
		m.home();
		m.money();
		m.car();
		m.bike();
		System.out.println("properties of son_two class");
		System.out.println(m);
		
	}
}
