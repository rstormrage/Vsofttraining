package com.mts.dao;

import java.util.ArrayList;

import com.mts.pojo.Movie;

public interface CustomerDAO {
	public ArrayList<Movie> viewAllMovie();
	public void yourMovie();
	public void bookMovie();
	public void cancelMovie();

}
