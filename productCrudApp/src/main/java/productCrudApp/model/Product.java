package productCrudApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int pid;
	private String pname;
	private String pdesc;
	private long price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	public Product() {
	}
	
	
	public Product(int pid, String pname, String pdesc, long price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", price=" + price + "]";
	}
	
	

}
