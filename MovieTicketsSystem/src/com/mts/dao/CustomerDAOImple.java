package com.mts.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.mts.pojo.Customer;
import com.mts.pojo.Movie;

public class CustomerDAOImple implements CustomerDAO {
	Scanner sc = new Scanner(System.in);
	static Customer cus = new Customer();

	@Override
	public ArrayList<Movie> viewAllMovie() {
		// TODO Auto-generated method stub
		return AdminDAOImpl.mlist;
	}

	@Override
	public void yourMovie() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");
		System.out.println(cus.getBookedMovie());
		System.out.println("------------------------------------------");

	}

	@Override
	public void bookMovie() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Movie Number you want to book");
		int no = sc.nextInt();
		for(Movie mv: AdminDAOImpl.mlist) {
			if(mv.getNo() == no) {
				cus.setBookedMovie(mv);
				
			}
		}
		if (cus.getBookedMovie()!= null) {
			System.out.println("Booked successfully");
		}else {
			System.out.println("Movie does not exist");
		}

	}

	@Override
	public void cancelMovie() {
		// TODO Auto-generated method stub
		cus.setBookedMovie(null);
		System.out.println("Your Movie was canceled");

	}

}
