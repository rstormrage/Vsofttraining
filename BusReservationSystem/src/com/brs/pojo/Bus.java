package com.brs.pojo;

public class Bus {
	private int bno;
	private String from;
	private String to;
	private String time;

	public Bus(int bno, String from, String to, String time) {
	
		this.bno = bno;
		this.from = from;
		this.to = to;
		this.time = time;
	}
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Bus [bno=" + bno + ", from=" + from + ", to=" + to + ", time=" + time + "]\n";
	}
	
	

}
