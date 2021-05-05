package abstracts;

import interfaces.Entity;

public abstract class Product implements Entity {
	
	private int id = 0;
	private String code = "";	
	private String name = "";
	private String unitType = "";
	private double price = 0;
	private double priceAfterDiscount = 0;
	
	public Product() {
		
	}
	
	public Product(int id, String code, String name, String unitType, double price, double priceAfterDiscount) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.unitType = unitType;
		this.price = price;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	
	
	
	
	
	
	

}
