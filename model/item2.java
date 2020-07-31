package model;

public class item2 {
	private int id;
	private String model;
	private int quantity;
	private float size;
	private String e_date;
	private float s_price,b_price,r_price;
	private String day_time;
	
	
	public item2(){
		super();
	}

	
	public item2(int id, String model, int quantity, float size, String e_date, float s_price, float b_price,
			float r_price, String day_time) {
		super();
		this.id = id;
		this.model = model;
		this.quantity = quantity;
		this.size = size;
		this.e_date = e_date;
		this.s_price = s_price;
		this.b_price = b_price;
		this.r_price = r_price;
		this.day_time = day_time;
	}


	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


	public String getmodel() {
		return model;
	}


	public void setmodel(String model) {
		this.model = model;
	}


	public int getquantity() {
		return quantity;
	}


	public void setquantity(int quantity) {
		this.quantity = quantity;
	}


	public float getsize() {
		return size;
	}


	public void setsize(float size) {
		this.size = size;
	}


	public String gete_date() {
		return e_date;
	}


	public void sete_date(String e_date) {
		this.e_date = e_date;
	}


	public float gets_price() {
		return s_price;
	}


	public void sets_price(float s_price) {
		this.s_price = s_price;
	}


	public float getb_price() {
		return b_price;
	}


	public void setb_price(float b_price) {
		this.b_price = b_price;
	}


	public float getr_price() {
		return r_price;
	}


	public void setr_price(float r_price) {
		this.r_price = r_price;
	}


	public String getday_time() {
		return day_time;
	}


	public void setday_time(String day_time) {
		this.day_time = day_time;
	}


	@Override
	public String toString() {
		return "item2 [id=" + id + ", model=" + model + ", quantity=" + quantity + ", size=" + size + ", e_date="
				+ e_date + ", s_price=" + s_price + ", b_price=" + b_price + ", r_price=" + r_price + ", day_time="
				+ day_time + ", getId()=" + getid() + ", getmodel()=" + getmodel() + ", getquantity()=" + getquantity()
				+ ", getsize()=" + getsize() + ", gete_date()=" + gete_date() + ", gets_price()=" + gets_price()
				+ ", getb_price()=" + getb_price() + ", getr_price()=" + getr_price() + ", getday_time()="
				+ getday_time() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
