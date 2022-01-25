import java.util.Scanner;

public class IceCreamDetails {
	int vanillaIC_price = 12;
	int strawberryIC_price = 11;
	
	int vanillaIC_bill = 0;
	int strawberryIC_bill = 0;

	
	static int icecream_total = 0;
	static Scanner myScan = new Scanner(System.in);
	
	void vanillaIC() {
		System.out.println("How many ball do you want");
		int ball = myScan.nextInt();
		vanillaIC_bill = ball * vanillaIC_price;
		icecream_total += vanillaIC_bill;
		System.out.println(ball + " ball vanilla icecream: " + vanillaIC_bill);
	}
	
	void strawberryIC() {
		System.out.println("How many ball do you want");
		int ball = myScan.nextInt();
		strawberryIC_bill = ball * strawberryIC_price;
		icecream_total += strawberryIC_bill;
		System.out.println(ball + " ball strawberry icecream: " +strawberryIC_bill);
	}
	
	public void iceCreamMenu() {
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("------------1) Vanilla---------------");
			System.out.println("------------2) Strawberry------------");
			System.out.println("------------3) Exit------------------");
			System.out.println("-------------------------------------");
			
			int choice = myScan.nextInt();
			switch(choice) {
			case 1:
				vanillaIC();
				iceCreamMenu();
				break;
			case 2:
				strawberryIC();
				iceCreamMenu();
				break;
			case 3:
				RestaurantApp.main(null);
				default:
					System.out.println("Choose 1 to 3");
			}
		}
	}

}
