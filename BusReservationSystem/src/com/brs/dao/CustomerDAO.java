package com.brs.dao;

import java.util.ArrayList;

import com.brs.pojo.Bus;

public interface CustomerDAO {
	public ArrayList<Bus> viewAllBus();
	public void yourBus();
	public void bookBus();
	public void cancelBus();

}
