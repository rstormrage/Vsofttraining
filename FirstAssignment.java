
public class FirstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstAssignment swap = new FirstAssignment();
		swap.swapTnums();
		swap.swapTnumsnonTemp();
		swap.swapThnum();
		swap.swapThnumnonTemp();
		swap.swapFnum();
		swap.swapFnumnonTemp();
		FirstAssignment total = new FirstAssignment();
		System.out.println();
		System.out.println("JioFiber Silber plan final cost: " + total.jioFiber());
		System.out.println();
		System.out.println("Two dominos' pizzas cost: " + total.dominosAmount());
		System.out.println();
		System.out.println("Salary after tax: " + total.salaryAfterTax());
		System.out.println();
		total.finalAmount();

	}
	
	public void swapTnums() {
		int fnum = 10, snum = 20;
		int temp;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum);
		temp = fnum;
		fnum = snum;
		snum = temp;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum);
	}
	
	public void swapTnumsnonTemp() {
		int fnum = 100, snum = 200;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum);
		fnum = fnum ^ snum;
		snum = fnum ^ snum;
		snum = fnum ^ snum;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum);
	}
	
	public void swapThnum() {
		int fnum = 10, snum = 20, tnum = 30;
		int temp;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum);
		temp = fnum;
		fnum = snum;
		snum = tnum;
		tnum = temp;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum);
	}
	
	public void swapThnumnonTemp() {
		int fnum = 100, snum = 200, tnum = 300;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum);
		fnum = fnum ^ snum ^ tnum;
		snum = fnum ^ snum ^ tnum;
		tnum = fnum ^ snum ^ tnum;
		fnum = fnum ^ snum ^ tnum;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum);
	}
	
	public void swapFnum() {
		int fnum = 10, snum = 20, tnum = 30, fonum = 40;
		int temp;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum + "  fourth number:" + fonum);
		temp = fnum;
		fnum = snum;
		snum = tnum;
		tnum = temp;
		fonum = temp;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum + "  fourth number:" + fonum);
	}
	
	public void swapFnumnonTemp() {
		int fnum = 100, snum = 200, tnum = 300, fonum = 400;
		System.out.println();
		System.out.println("Before swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum + "  fourth number:" + fonum);
		fnum = fnum ^ snum ^ tnum ^ fonum;
		snum = fnum ^ snum ^ tnum ^ fonum;
		tnum = fnum ^ snum ^ tnum ^ fonum;
		fonum = fnum ^ snum ^ tnum ^ fonum;
		fnum = fnum ^ snum ^ tnum ^ fonum;
		System.out.println("After swaping" + "  first number:" + fnum + "  second number:" + snum + "  third number:" + tnum + "  fourth number:" + fonum);
	}
	
	public double jioFiber() {
		int plan = 699;
		double gst = 0.18;
		double total;
		total = plan + plan * gst;
		return total;
	}
	
	public double dominosAmount() {
		double pizzaAmount = 399.0;
		int order = 2;
		double discount = 0.2;
		double total;
		total = pizzaAmount * order * (1-discount);
		return total;
	}
	
	public double salaryAfterTax() {
		double salary = 85000;
		double tax = 0.2;
		double finalSalary;
		finalSalary = salary * (1 - tax);
		return finalSalary;		
	}
	
	public void finalAmount() {
		double deposit = 500000;
		int year = 5;
		double interest =0.068;
		double total = deposit + deposit * year * interest / 100;
		System.out.println();
		System.out.println("Interest amount is " + deposit * year * interest / 100);
		System.out.println("Final amount is " + total);
	}

}
