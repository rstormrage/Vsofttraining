package com.brs.dao;

import java.util.ArrayList;

import com.brs.pojo.Bus;

public interface AdminDAO {
	public void addBus();
	public ArrayList<Bus> viewAllBus();
	public Bus viewBus(int bno);
	public void updateBus();
	public void deleteBus();
	

}
