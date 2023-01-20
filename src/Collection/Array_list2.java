package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Array_list2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("Ganesh");
		al.add(100);
		al.add('A');
		al.add(null);
		//print entire data
		System.out.println(al);
	//get the size
		System.out.println(al.size());
//		//empty checking
	//System.out.println(al.isEmpty());//false
//		//containing data or not
		System.out.println(al.contains(200));//true
//		//get data from particular index
		System.out.println(al.get(0));
		//fetch data using iterator(universal cursor)
	//Iterator itr = al.iterator();
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
//		}
	//	}
		//fetch the data using list Iterator
	//ListIterator litr = al.listIterator();
	//while(litr.hasNext()) {
		//	System.out.println(litr.next());
		//print data using for each loop
	//	for(Object s :al) {
		//	System.out.println(s);
			
		}	
	//}
			
	}		
			
//}		
		
	


