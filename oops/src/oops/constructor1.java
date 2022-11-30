package oops;
class Custo{
	int cid;
	String cname;
	long cnum;
	public Custo() {
		cname="Rohit";
	}
	public Custo(int cid, String cname, long cnum) {
		this(cid);
	}
	public Custo(int cid) {
		this();
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public long getCnum() {
		return cnum;
	}
	
	
}
public class constructor1 {
	public static void main(String[] args) {
		Custo c=new Custo(112,"shirshak",998162563); 
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getCnum());
	}
}
