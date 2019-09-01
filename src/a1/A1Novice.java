package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String first = "", last = "", name = "";
		int num = 0, solnum = 0;
		double sum = 0, price = 0, wapr = 0;
		char Fir = 0;
		
		int alcu = scan.nextInt();
	    for (int i=0; i < alcu; i++) {
	    	first = scan.next();
	    	Fir = first.charAt(0);
		    last = scan.next();
		    num = scan.nextInt();
		    for  (int a=0; a  < num; a++) {
		    	solnum = scan.nextInt();
			    name = scan.next();
			    price = scan.nextDouble();
			    wapr = solnum * price;
			    sum += wapr;
		   }
		    System.out.println(Fir + "." + " " + last + ":" + " " + String.format("%,.2f", sum));
		    sum = 0;
	    }
	    scan.close();
	}
	    
}
