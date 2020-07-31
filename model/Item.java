package model;

import java.io.File;

public class Item {

	private String name;
	private String model;
	private int quantity;
	private float size;
	private String m_date;
	private String expiry_date;
	private float selling_price;
	private float buying_price;
	private float regular_price;
	private String day_time;
	private String image;
	 File f=null;
	public Item() {
		super();
	}

	public Item(String name, String model, int quantity, float size, String m_date, String expiry_date,
			float selling_price, float buying_price, float regular_price, String day_time, String image) {
		super();
		this.name = name;
		this.model = model;
		this.quantity = quantity;
		this.size = size;
		this.m_date = m_date;
		this.expiry_date = expiry_date;
		this.selling_price = selling_price;
		this.buying_price = buying_price;
		this.regular_price = regular_price;
		this.day_time = day_time;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getM_date() {
		return m_date;
	}

	public void setM_date(String m_date) {
		this.m_date = m_date;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public float getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(float selling_price) {
		this.selling_price = selling_price;
	}

	public float getBuying_price() {
		return buying_price;
	}

	public void setBuying_price(float buying_price) {
		this.buying_price = buying_price;
	}

	public float getRegular_price() {
		return regular_price;
	}

	public void setRegular_price(float regular_price) {
		this.regular_price = regular_price;
	}

	public String getDay_time() {
		return day_time;
	}

	public void setDay_time(String day_time) {
		this.day_time = day_time;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", model=" + model + ", quantity=" + quantity + ", size=" + size + ", m_date="
				+ m_date + ", expiry_date=" + expiry_date + ", selling_price=" + selling_price + ", buying_price="
				+ buying_price + ", regular_price=" + regular_price + ", day_time=" + day_time + ", image=" + image
				+ ", getName()=" + getName() + ", getModel()=" + getModel() + ", getQuantity()=" + getQuantity()
				+ ", getSize()=" + getSize() + ", getM_date()=" + getM_date() + ", getExpiry_date()=" + getExpiry_date()
				+ ", getSelling_price()=" + getSelling_price() + ", getBuying_price()=" + getBuying_price()
				+ ", getRegular_price()=" + getRegular_price() + ", getDay_time()=" + getDay_time() + ", getImage()="
				+ getImage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
