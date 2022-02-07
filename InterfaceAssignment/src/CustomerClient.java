import java.util.ArrayList;
import java.util.Scanner;

public class CustomerClient {
	static Scanner sc = new Scanner(System.in);
	static CustomerDaoImpl dao = new CustomerDaoImpl();
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("              1)AddCustomer               ");
			System.out.println("              2)ViewAllCustomer           ");
			System.out.println("              3)ViewCustomer              ");
			System.out.println("              4)Exit                      ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				dao.addCustomers();
				break;
			case 2:
				System.out.println(dao.viewAllCustomers());				
				break;
			case 3:
				System.out.println("Enter the User number");
				int id = sc.nextInt();
				Customer cus = dao.viewCustomer(id);
				System.out.println(cus);
				break;
			case 4:
				System.out.println("Thx for using");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 4");
			}

		}
	}
}
