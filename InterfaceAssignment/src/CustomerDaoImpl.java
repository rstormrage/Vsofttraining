import java.util.ArrayList;
import java.util.Scanner;

interface CustomerDao{
	void addCustomers();
	ArrayList<Customer> viewAllCustomers();
	Customer viewCustomer(int id);
}
public class CustomerDaoImpl implements CustomerDao {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Customer> list = new ArrayList<>();

	@Override
	public void addCustomers() {
		System.out.println("How many customer do you want to add");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Customer ID");
			int cno = sc.nextInt();
			System.out.println("Enter Customer Name");
			String cname = sc.next();
			System.out.println("Enter Customer Email");
			String cemail = sc.next();
			System.out.println("Enter Customer Address");
			String cadd = sc.next();
			Customer cu = new Customer(cno, cname, cadd, cemail);
			list.add(cu);
		}
	}

	@Override
	public ArrayList<Customer> viewAllCustomers() {
		return list;
	}

	@Override
	public Customer viewCustomer(int id) {
		if(list != null) {
			for(Customer cu: list) {
				if(cu.getCno() == id) {
					return cu;
				}
			}
		}
		return null;
	}

}
