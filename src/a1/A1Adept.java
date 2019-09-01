package a1;

import java.util.*;
public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int shonu = 0,nucu = 0,buyal = 0,buynu = 0;
		String namby = "";
		double one = 0, perall = 0, biggest = 0, smallest = 0, ave = 0;
		
		shonu = scan.nextInt();
		String[] itnalst = new String[shonu];
		double[] inprilst = new double[shonu];
		for (int i=0; i<shonu; i++) {
			itnalst[i] = scan.next();
			inprilst[i] = scan.nextDouble();
			}
		nucu = scan.nextInt();
		String[] namelsfir = new String[nucu];
		String[] namelslas = new String[nucu];
		double[] amtlst = new double[nucu];
		for (int a=0; a<nucu; a++) {
			namelsfir[a] = scan.next();
			namelslas[a] = scan.next();
			buyal = scan.nextInt();
			for (int b=0; b<buyal; b++) {
				buynu = scan.nextInt();
				namby = scan.next();
				for(int i = 0;i<shonu;i++) {
					if (itnalst[i].equals(namby)) {
						one = inprilst[i]*buynu;
						perall+=one;
					}
				}
				amtlst[a] = perall;
				perall = 0;
				}
			}
			biggest = A1Example.findValueMax(amtlst);
			smallest = A1Example.findValueMin(amtlst);
			for (int c=0; c<amtlst.length; c++) {
				if (biggest == amtlst[c]) {
				System.out.println("Biggest: " + namelsfir[c] + " "+ namelslas[c] + " (" + biggest + ")");
				}
			}
			for (int d=0; d<amtlst.length; d++) {
				if (smallest == amtlst[d]) {
				System.out.println("Smallest: " + namelsfir[d] + " "+ namelslas[d] + " (" + smallest + ")");
				}
			}
			ave = A1Example.calculateValueSum(amtlst)/amtlst.length;
			System.out.println("Average: " + String.format("%,.2f", ave));
			scan.close();
		}	
}
