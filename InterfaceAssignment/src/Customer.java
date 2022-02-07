
public class Customer {
	private int cno;
	private String cname;
	private String cadd;
	private String cemail;
	public Customer(int cno, String cname, String cadd, String cemail) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cadd = cadd;
		this.cemail = cemail;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", cadd=" + cadd + ", cemail=" + cemail + "]\n";
	}
	

}
