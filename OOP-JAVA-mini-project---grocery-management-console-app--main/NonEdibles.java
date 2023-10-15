import java.util.Scanner;


public class NonEdibles extends Grocery
{

	private String materials;

	NonEdibles(String groceryName, String groceryManufacturer, double price, int availableQuantity, String materials){

		super ( groceryName, groceryManufacturer, price, availableQuantity);
		this.materials = materials;
		
			}


	NonEdibles()
	{
	

		Scanner input = new Scanner(System.in);
		System.out.println("Type in Grocery material list -");
		this.materials = input.nextLine();
		System.out.println("Grocery matrials set to  : " +  this.materials );


		super.showList();
		System.out.print(",  Grocery materials : " +  this.materials  + "\n");


	}
	
	
	public void showDetails()
	{
		
		super.showList();
		System.out.print(",  Grocery materials : " +  this.materials  + "\n");
	}
}
		
		