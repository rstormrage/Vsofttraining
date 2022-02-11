package com.mts.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.mts.pojo.Movie;

public class AdminDAOImpl implements AdminDAO{
	Scanner sc = new Scanner(System.in);
	public static ArrayList<Movie> mlist = new ArrayList<>();

	@Override
	public void addMovie() {
		// TODO Auto-generated method stub
		System.out.println("How many Movie do you want to add");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Movie Name");
			String name = sc.next();
			System.out.println("Enter Movie ID");
			int no = sc.nextInt();
			System.out.println("Enter Movie Time");
			String time = sc.next();
			System.out.println("Enter Movie room");
			int room = sc.nextInt();
			Movie mv = new Movie(name, no, time, room);
			mlist.add(mv);
			System.out.println("Added successfully");
		}

		
	}

	@Override
	public ArrayList<Movie> viewAllMovie() {
		// TODO Auto-generated method stub
		return mlist;
	}

	@Override
	public Movie viewmovie(int no) {
		// TODO Auto-generated method stub
		for(Movie mv: mlist) {
			if(mv.getNo() == no) {
				return mv;
			}
		}
		return null;
	}

	@Override
	public void updateMovie() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Movie Number you want to update");
		int no = sc.nextInt();		
		int index = 0;
		for(Movie mv: mlist) {
			if(mv.getNo() == no) {
				index = mlist.indexOf(mv);
				System.out.println("Enter Movie Name");
				String name = sc.next();
				System.out.println("Enter Movie ID");
				no = sc.nextInt();
				System.out.println("Enter Movie Time");
				String time = sc.next();
				System.out.println("Enter Movie room");
				int room = sc.nextInt();
				Movie newmv = new Movie(name, no, time, room);

				System.out.println(newmv);
				mlist.set(index, newmv);
				System.out.println("Update successfully");
			}else {
				System.out.println("Bus does not exist");
			}
		}
		
	}

	@Override
	public void deleteMovie() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Movie Number you want to delete");
		int no = sc.nextInt();		
		int index = 0;
		for(Movie mv: mlist) {
			if(mv.getNo() == no) {
				index = mlist.indexOf(mv);
				System.out.println(mlist.get(index));
				mlist.remove(index);
				System.out.println("Deleted successfully");
			}else {
				System.out.println("Movie does not exist");
			}
		}
	}

}
