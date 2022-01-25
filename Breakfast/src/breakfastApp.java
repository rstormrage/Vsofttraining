import java.util.Scanner;

public class breakfastApp {
	int bonda_price = 40;
	int dosa_price = 50;
	int idly_price = 60;
	
	int bonda_bill = 0;
	int dosa_bill = 0;
	int idly_bill = 0;
	
	static Scanner myScan = new Scanner(System.in);
	static int bonda_total = 0;
	static int dosa_total = 0;
	static int idly_total = 0;
	
	void bonda() {
		System.out.println("How many bonda do you want");
		int numb = myScan.nextInt();
		bonda_bill = numb * bonda_price;
		bonda_total += bonda_bill;
		System.out.println(numb + " bonda: " + bonda_bill);
	}
	
	void dosa() {
		System.out.println("How many dosa do you want");
		int numb = myScan.nextInt();
		dosa_bill = numb * dosa_price;
		dosa_total += dosa_bill;
		System.out.println(numb + " bonda: " + dosa_bill);
	}
	
	void idly() {
		System.out.println("How many idly do you want");
		int numb = myScan.nextInt();
		idly_bill = numb * idly_price;
		idly_total += idly_bill;
		System.out.println(numb + " bonda: " + idly_bill);
	}
	
	static void bill() {
		breakfastApp bills = new breakfastApp();
		int total = bills.bonda_total + bills.dosa_total + bills.idly_total;
		System.out.println("-------------------------------------");
		System.out.println("Bonda Bill: " + bills.bonda_total);
		System.out.println("Dosa Bill: " + bills.dosa_total);
		System.out.println("Idly Bill: " + bills.idly_total);
		System.out.println("Total is : " + total);
		System.out.println("-------------------------------------");
	}
	
	public static void main(String [] arg) {
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("--------------1) Bonda---------------");
			System.out.println("--------------2) Dosa----------------");
			System.out.println("--------------3) Idly----------------");
			System.out.println("--------------4) Bill----------------");
			System.out.println("--------------5) Exit----------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter your choice");
			
			int choice = myScan.nextInt();
			
			switch(choice) {
			case 1:
				breakfastApp bondaDetails = new breakfastApp();
				bondaDetails.bonda();
				break;
			case 2:
				breakfastApp dosaDetails = new breakfastApp();
				dosaDetails.dosa();
				break;
			case 3:
				breakfastApp idlyDetails = new breakfastApp();
				idlyDetails.idly();
				break;
			case 4:
				breakfastApp bills = new breakfastApp();
				bills.bill();
				break;
			case 5:
				System.exit(0);
			}
		}
	}

}
