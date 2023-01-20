package Array;

public class Example2 {
	public static void main(String[] args) {
		int ar[]=new int [5];
		ar[0]=10;
		ar[1]=20;
        ar[2]=30;		
        ar[3]=40;
        ar[4]=50;
//System.out.println(ar[0]);//10
//System.out.println(ar[2]);//30
//System.out.println(ar[4]);//50

for (int i=0; i<=ar.length-1; i++) {
	System.out.println(ar[i]);//10 20 30 40 50
	
	//for (int j=0; j<=4; j++) {
		//System.out.println(ar[i]);
	}
}
	}



