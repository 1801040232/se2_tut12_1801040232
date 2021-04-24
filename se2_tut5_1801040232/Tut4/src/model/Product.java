package model;

public class Product {
	
	protected String proId;
	protected String proName; 
	
	public Product(String proId, String proName) {
		super();
		this.proId = proId;
		this.proName = proName;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
	

	
}
