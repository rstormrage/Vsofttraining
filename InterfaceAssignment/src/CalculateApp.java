import java.util.*;

interface Calculate{
	void add();
	void sub();
	void mul();
}

class CalculateAppImpl implements Calculate{
	Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		int fnum, snum;
		System.out.println("enter two numb");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		System.out.println((fnum+snum));
	}

	@Override
	public void sub() {
		int fnum, snum;
		System.out.println("enter two numb");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		System.out.println((fnum-snum));
		
	}

	@Override
	public void mul() {
		int fnum, snum;
		System.out.println("enter two numb");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		System.out.println((fnum/snum));
		
	}
	
}

public class CalculateApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("chose a function\n 1.add\n 2.sub\n 3.mul");
		CalculateAppImpl cal = new CalculateAppImpl();
		int choice = sc.nextInt();
		if(choice == 1) {
			cal.add();
		}else if(choice == 2) {
			cal.sub();
		}else if(choice == 3) {
			cal.mul();
		}
	}

}
