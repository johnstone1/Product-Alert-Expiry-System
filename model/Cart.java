package model;

public class Cart {
	
	private String name,model;
	private int quantity;
	private float size,selling_price;
	private String day_time;
	private int id;
	
	public Cart() {
		super();
	}

	public Cart(String name, String model, int quantity, float size, float selling_price,String day_time,int id) {
		super();
		this.name = name;
		this.model = model;
		this.quantity = quantity;
		this.size = size;
		this.selling_price = selling_price;
		this.day_time=day_time;
		this.id=id;
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

	public float getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(float selling_price) {
		this.selling_price = selling_price;
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
		return "Cart [name=" + name + ", model=" + model + ", quantity=" + quantity + ", size=" + size
				+ ", selling_price=" + selling_price + ", day_time=" + day_time + ", id=" + id + ", getName()="
				+ getName() + ", getModel()=" + getModel() + ", getQuantity()=" + getQuantity() + ", getSize()="
				+ getSize() + ", getSelling_price()=" + getSelling_price() + ", getDay_time()=" + getDay_time()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

	
}
