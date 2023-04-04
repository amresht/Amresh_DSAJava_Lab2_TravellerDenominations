/**
 * @class          BillCounter Package Class 
 * @author          Amresh Tripathi 
 * @date            04-Apr-2023
 * @version         1.0
 */
package model;

public class BillCounter {

	public BillCounter() {
		// TODO Auto-generated constructor stub
	}

	public void counting(int[] currency, int amount) {
		
		int noteCount[]=new int[currency.length];
		int sumofnotes=0;
		
		for(int i=0;i<currency.length;i++)
		{
			noteCount[i]=amount/currency[i];
			amount=amount%currency[i];
			sumofnotes+=noteCount[i];
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0; i<currency.length; i++)
		{
			
			if(noteCount[i]!=0)
			{
				System.out.println(currency[i] + ":" + noteCount[i] );
			}
		}
		
		System.out.println("Total Notes "+sumofnotes);
		
	}

}