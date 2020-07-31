package model;

public class Items {
private String name,model,m_date,expiry_date,day_time;
private int quantity;
private float size,buying_price,selling_price,regular_price;
private int id;	
	
	public Items() {
		super();
	}

	public Items(String name, String model, String m_date, String expiry_date, int quantity,float size, float buying_price,float selling_price,float regular_price,String day_time, int id) {
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
		this.day_time=day_time;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String uname) {
		this.name = uname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public float getBuying_price() {
		return buying_price;
	}

	public void setBuying_price(float buying_price) {
		this.buying_price = buying_price;
	}

	public float getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(float selling_price) {
		this.selling_price = selling_price;
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

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", model=" + model + ", m_date=" + m_date + ", expiry_date=" + expiry_date
				+ ", day_time=" + day_time + ", quantity=" + quantity + ", size=" + size + ", buying_price="
				+ buying_price + ", selling_price=" + selling_price + ", regular_price=" + regular_price + ", id=" + id
				+ ", getName()=" + getName() + ", getModel()=" + getModel() + ", getM_date()=" + getM_date()
				+ ", getExpiry_date()=" + getExpiry_date() + ", getQuantity()=" + getQuantity() + ", getSize()="
				+ getSize() + ", getBuying_price()=" + getBuying_price() + ", getSelling_price()=" + getSelling_price()
				+ ", getRegular_price()=" + getRegular_price() + ", getDay_time()=" + getDay_time() + ", getId()="
				+ getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	


}
