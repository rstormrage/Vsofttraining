package com.fee;

public class StudentClient {
	public static void main(String[] args) {
		Student stu = new Student(1, "yi", 123456, "7ave", "Java", 80);
		System.out.println(stu.toString());
		System.out.println(stu.studentFee());
		
		FastTrackBatchStudent fstu = new FastTrackBatchStudent(2, "er", 1234567, "6ave", "C++", 120, 0.8);
		System.out.println(fstu.toString());
		System.out.println(fstu.studentFee());
		
		CorporateBatchStudent cstu = new CorporateBatchStudent(3, "san", 12345678, "5ave", "C#", 220, 0.8);
		System.out.println(cstu.toString());
		System.out.println(cstu.studentFee());
		
		WeekendBatchStudent wstu = new WeekendBatchStudent(4, "si", 123456789, "4ave", "Python", 230, 2);
		System.out.println(wstu.toString());
		System.out.println(wstu.studentFee());
	}
}
