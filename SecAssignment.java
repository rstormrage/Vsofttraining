import java.util.Scanner;
import java.util.*;

public class SecAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner myScan = new Scanner(System.in);
		SecAssignment prin = new SecAssignment();
		prin.star();
		System.out.println();
		prin.prinA();
		System.out.println();
		prin.oneToFive();
		System.out.println();
		prin.fiveToOneStar();
		System.out.println();
		prin.oneToFiveStar();
		System.out.println();
		prin.atSign();
		System.out.println();
		prin.oneToTen();
		System.out.println();
		prin.oneToTenOdd();
		System.out.println();
		prin.oneToTenEven();
		System.out.println();
		prin.onePlusThree();
		System.out.println();
		prin.aToE();
		System.out.println();
		prin.aToZ();
		System.out.println();
		prin.oneToHuEven();
		System.out.println();
		prin.primeNum();
		System.out.println();
		System.out.println("Compute and print nth Fibonacci number, enter n");
		int numb = myScan.nextInt();
		System.out.println(fibonacci(numb));
		System.out.println();
		System.out.println("Palindrome, enter a number or a word ");
		String str = myScan.next();
		if(isPalindrome(str)) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
		System.out.println();
		System.out.println("Factorial, enter a number");
		int fact = myScan.nextInt();
		System.out.println(factorial(fact));
		System.out.println();
		System.out.println("Armstrong number, enter a number");
		int aNum = myScan.nextInt();
		System.out.println(prin.armStrongNumb(aNum));
		System.out.println("Odd or Even Number, enter a number:");
		int number = myScan.nextInt();
		if (prin.oddOrEven(number)) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		System.out.println();
		System.out.println("Enter a year:");
		int year = myScan.nextInt();
		if (prin.leapYear(year)) {
			System.out.println(year + "is leap year");
		}else {
			System.out.println(year + "is not leap year");
		}

	}
	
	public void star() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void prinA() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("A");
			}
			System.out.println();
		}
	}
	
	public void oneToFive() {
		for(int i = 0; i < 5; i++) {			
			for(int j = 0; j < 5; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}
	
	public void fiveToOneStar() {
		for(int i = 0; i <= 5; i++) {
			
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void oneToFiveStar() {
		for(int i = 0; i <= 5; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void atSign() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 0 || i == 4) {
					System.out.print("@");
					
				}else if (j == 0 || j == 4) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}
	
	public void oneToTen() {
		int k = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
	
	public void oneToTenOdd() {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {				
				System.out.print(k + " ");
				k += 2;
			}
			System.out.println();
		}
	}
	
	public void oneToTenEven() {
		int k = 2;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {				
				System.out.print(k + " ");
				k += 2;
			}
			System.out.println();
		}
	}
	
	public void onePlusThree() {
		int k = 1;
		for(int i = 0; i < 4; i++) {			
			for(int j = 0; j < 5; j++) {				
				System.out.print(k + " ");				
				k += 3;
				if(k > 50) {
					break;
				}
			}			
			System.out.println();
		}
	}
	
	public void aToE() {
		for(int i = 0; i < 5; i++) {
			char str = 'A';
			for(int j = 0; j < 5; j++) {
				System.out.print(str++);
			}
			System.out.println();
		}
	}
	
	public void aToZ() {
		char str = 'A';
		for(int i = 0; i < 5; i++) {			
			for(int j = 0; j < 6; j++) {
				System.out.print(str++ + " ");
				if(str > 'Z') {
					break;
				}
			}
			System.out.println();
		}
	}
	
	public void oneToHuEven() {
		int k = 2;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {				
				System.out.print(k + " ");
				k += 2;
			}
			System.out.println();
		}
	}
	
	public void primeNum() {
		for(int i = 2; i <= 100; i++) {
			boolean prime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 0 || n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static boolean isPalindrome(String data) {
		int len = data.length();
		for (int i = 0; i < len/2; i++) {
			if(data.charAt(i) != data.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static long factorial(int numb) {
		if(numb <= 1) return 1; 
		long res = 1;
		for(int i = 1; i <= numb; i++) {
			res = res * i;
		}
		return res;
	}
	
	public static boolean armStrongNumb(int numb) {
		String s1 = String.valueOf(numb);
		int len = s1.length();
		
		double res = 0;
		for(int i = 0; i < len; i++) {
			
			res = res + Math.pow(Character.getNumericValue(s1.charAt(i)),len);
			
		}
		if(res == numb) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean oddOrEven(int numb) {
		if(numb % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean leapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			return true;
		}else {
			return false;
		}
	}

}


