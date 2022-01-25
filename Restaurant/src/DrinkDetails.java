import java.util.Scanner;

public class DrinkDetails {
	int sprite_price = 5;
	int thumsUp_price = 6;
	int tea_price = 7;
	int coffee_price = 8;
	
	int sprite_bill = 0;
	int thumsUp_bill = 0;
	int tea_bill = 0;
	int coffee_bill = 0;
	
	static int dirink_total = 0;
	static Scanner myScan = new Scanner(System.in);
	
	void softDrinks () {
		System.out.println("1.Sprite 2.ThumsUp which one do you want");
		int soft = myScan.nextInt();
		if(soft == 1) {
			System.out.println("How many sprite do you want");
			int cans = myScan.nextInt();
			sprite_bill = cans * sprite_price;
			dirink_total += sprite_bill;
			System.out.println(cans + " can Sprite: " + sprite_bill);
		}else if (soft == 2) {
			System.out.println("How many ThumsUp do you want");
			int cans = myScan.nextInt();
			thumsUp_bill = cans * thumsUp_price;
			dirink_total += thumsUp_bill;
			System.out.println(cans + " can Sprite: " + thumsUp_bill);
		}else {
			System.out.println("Please enter 1 or 2");			
		}
		
	}
	
	void hotDrinks () {
		System.out.println("1.Tea 2.Coffee which one do you want");
		int soft = myScan.nextInt();
		if(soft == 1) {
			System.out.println("How many Tea do you want");
			int caps = myScan.nextInt();
			tea_bill = caps * tea_price;
			dirink_total += tea_bill;
			System.out.println(caps + " can Sprite: " + tea_bill);
		}else if (soft == 2) {
			System.out.println("How many Coffee do you want");
			int caps = myScan.nextInt();
			coffee_bill = caps * coffee_price;
			dirink_total += coffee_bill;
			System.out.println(caps + " can Sprite: " + coffee_bill);
		}else {
			System.out.println("Please enter 1 or 2");			
		}
		
	}
	
	public void drinksMenu() {
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("-----------1) Soft Drink-------------");
			System.out.println("-----------2) Hot Drink--------------");
			System.out.println("-----------3) Exit-------------------");
			System.out.println("-------------------------------------");
			
			int choice = myScan.nextInt();
			switch(choice) {
			case 1:
				softDrinks();
				drinksMenu();
				break;
			case 2:
				hotDrinks ();
				drinksMenu();
				break;
			case 3:
				RestaurantApp.main(null);
				default:
					System.out.println("Choose 1 to 3");
			}
		}
	}

}
