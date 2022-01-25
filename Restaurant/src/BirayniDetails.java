import java.util.Scanner;

public class BirayniDetails {
	int chickenBirayni_price = 120;
	int vegBirayni_price = 100;
	int fishBirayni_price = 130;
	
	int chickenBirayni_bill = 0;
	int vegBirayni_bill = 0;
	int fishBirayni_bill = 0;
	
	static int birayni_total = 0;
	static Scanner myScan = new Scanner(System.in);
	
	void chickenBirayni () {
		System.out.println("How many chicken birayni do you want");
		int plates = myScan.nextInt();
		chickenBirayni_bill = plates * chickenBirayni_price;
		birayni_total += chickenBirayni_bill;
		System.out.println(plates + " plate chicken birayni: " + chickenBirayni_bill);
	}
	
	void vegBirayni () {
		System.out.println("How many veg birayni do you want");
		int plates = myScan.nextInt();
		vegBirayni_bill = plates * vegBirayni_price;
		birayni_total += vegBirayni_bill;
		System.out.println(plates + " plate veg birayni: " +vegBirayni_bill);
	}
	
	void fishBirayni () {
		System.out.println("How many fish birayni do you want");
		int plates = myScan.nextInt();
		fishBirayni_bill = plates * fishBirayni_price;
		birayni_total += fishBirayni_bill;
		System.out.println(plates + " plate fish birayni: " +fishBirayni_bill);
	}
	
	public void birayniMenu() {
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("---------1) Chicken Birayni----------");
			System.out.println("---------2) Veg Birayni--------------");
			System.out.println("---------3) Fish Birayni-------------");
			System.out.println("---------4) Exit---------------------");
			System.out.println("-------------------------------------");
			
			int choice = myScan.nextInt();
			switch(choice) {
			case 1:
				chickenBirayni();
				birayniMenu();
				break;
			case 2:
				vegBirayni();
				birayniMenu();
				break;
			case 3:
				fishBirayni();
				birayniMenu();
				break;
			case 4:
				RestaurantApp.main(null);
				default:
					System.out.println("Choose 1 to 4");
			}
		}
	}

}
