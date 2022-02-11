package com.mts.pojo;

public class Movie {
	private String name;
	private int no;
	private String time;
	private int room;
	
	public Movie(String name, int no, String time, int room) {
		
		this.name = name;
		this.no = no;
		this.time = time;
		this.room = room;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", no=" + no + ", time=" + time + ", room=" + room + "]\n";
	}
	

}
