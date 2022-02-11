package com.mts.dao;

import java.util.ArrayList;
import com.mts.pojo.Movie;



public interface AdminDAO {
	public void addMovie();
	public ArrayList<Movie> viewAllMovie();
	public Movie viewmovie(int bno);
	public void updateMovie();
	public void deleteMovie();

}
