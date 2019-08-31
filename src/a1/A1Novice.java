package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		String name = "";
	    
	    int alcu = scan.nextInt();
	    for (int i=0; i<alcu; i++); {
	    	String first = scan.next();
	    	char Fir = first.charAt(0);
		    String last = scan.next();
		    int num = scan.nextInt();
		    for  (int a=0; a<num; a++);{
		    	int solnum = scan.nextInt();
			    name = scan.next();
			    double price = scan.nextInt();
			    double wapr = solnum * price;
			    sum += wapr;
		   }
		    
		    System.out.println(Fir + "." + " " + last + ":" + " " + String.format("%,.2f", sum)); 
	    }
	    
	}
	    
}
