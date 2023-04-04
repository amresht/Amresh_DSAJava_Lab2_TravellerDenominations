/**
 * @class          TravellerDenominations App Class 
 * @author          Amresh Tripathi 
 * @date            04-Apr-2023
 * @version         1.0
 */
package app;

import java.util.Arrays;
import java.util.Scanner;
import model.BillCounter;
import model.MergeSort;

public class TravellerDenominations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of denominations notes in your region");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		
		System.out.println("Enter the denominations");		
		for(int i=0;i<size;i++)
			currency[i]=sc.nextInt();
		
		System.out.println("Before Sorting "+ Arrays.toString(currency));
		MergeSort ms=new MergeSort();
		ms.sort(currency, 0, size-1);
		System.out.println("After Sorting "+ Arrays.toString(currency));
		
		System.out.println("Enter Total Amount");
		int amount=sc.nextInt();
		
		BillCounter bc=new BillCounter();
		bc.counting(currency,amount);
		
		sc.close();
	}
}