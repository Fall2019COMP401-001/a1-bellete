package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int totalItnum = 0, totalCusnum = 0, totalBuynum = 0, buyNum = 0;
		String cusName = "", buyNam = "";
		
		totalItnum = scan.nextInt();
		String[] itName = new String[totalItnum];
		double[] itPrice = new double[totalItnum];
		int[] eachItnum = new int[totalItnum];
		int[] eachCusnum = new int[totalItnum];
		for (int countIt = 0; countIt < totalItnum; countIt ++) {
			itName[countIt] = scan.next();
			itPrice[countIt] = scan.nextDouble();
		}
		totalCusnum = scan.nextInt();
		for(int countCus = 0; countCus < totalCusnum; countCus ++) {
			cusName = scan.next()+scan.next();
			totalBuynum = scan.nextInt();
			for (int countEvitem = 0; countEvitem < totalBuynum; countEvitem ++) {
				buyNum = scan.nextInt();
				buyNam=scan.next();
				for (int countIt = 0; countIt < totalItnum; countIt ++) {
					if (itName[countIt].equals(buyNam)) {
						eachItnum[countIt]+=buyNum;
						eachCusnum[countIt]+=1;
					}
				}
			}
		}
		for (int countIt = 0; countIt < totalItnum; countIt ++) {
			if (eachCusnum[countIt]== 0) {
				System.out.println("No customers bought"+itName[countIt]);
			} else {
				System.out.println(eachCusnum[countIt]+" customers bought " + eachItnum[countIt] + " " +itName[countIt]);
			}
		}
	scan.close();	
	}
}
