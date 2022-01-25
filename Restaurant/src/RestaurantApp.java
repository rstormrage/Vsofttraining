import java.util.Scanner;

public class RestaurantApp {
	static Scanner myScan = new Scanner(System.in);
	
	static void bill() {
		int total = BirayniDetails.birayni_total + DrinkDetails.dirink_total + BirayniDetails.birayni_total;
		System.out.println("-------------------------------------");
		System.out.println("Birayni Bill: " + BirayniDetails.birayni_total);
		System.out.println("Drinks Bill: " + DrinkDetails.dirink_total);
		System.out.println("IceCream Bill: " + IceCreamDetails.icecream_total);
		System.out.println("Total is : " + total);
		System.out.println("-------------------------------------");
	}
	
	
	
	public static void main(String[] arg) {
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("-------------1) Birayni--------------");
			System.out.println("-------------2) Drinks---------------");
			System.out.println("-------------3) IceCream-------------");
			System.out.println("-------------4) Bill-----------------");
			System.out.println("-------------5) Exit-----------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter your choice");
			
			int choice = myScan.nextInt();
			
			switch(choice) {
			case 1:
				BirayniDetails birayni = new BirayniDetails();
				birayni.birayniMenu();
				break;
			case 2:
				DrinkDetails drink = new DrinkDetails();
				drink.drinksMenu();
				break;
			case 3:
				IceCreamDetails iceCream = new IceCreamDetails();
				iceCream.iceCreamMenu();
				break;
			case 4:
				RestaurantApp bills = new RestaurantApp();
				bills.bill();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}

