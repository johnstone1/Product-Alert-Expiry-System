package model;

public class Sales {

	
	private String name;
	private String model;
	private int quantity;
	private float size;
	private float selling_prize;
	private float buying_price;
	private float reguar_price;
	private float profit;
	private float loss;
	
	
	private Sales(String name, String model, int quantity, float size, float selling_prize, float buying_price,
			float reguar_price, float profit, float loss) {
		super();
		this.name = name;
		this.model = model;
		this.quantity = quantity;
		this.size = size;
		this.selling_prize = selling_prize;
		this.buying_price = buying_price;
		this.reguar_price = reguar_price;
		this.profit = profit;
		this.loss = loss;
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


	public float getSelling_prize() {
		return selling_prize;
	}


	public void setSelling_prize(float selling_prize) {
		this.selling_prize = selling_prize;
	}


	public float getBuying_price() {
		return buying_price;
	}


	public void setBuying_price(float buying_price) {
		this.buying_price = buying_price;
	}


	public float getReguar_price() {
		return reguar_price;
	}


	public void setReguar_price(float reguar_price) {
		this.reguar_price = reguar_price;
	}


	public float getProfit() {
		return profit;
	}


	public void setProfit(float profit) {
		this.profit = profit;
	}


	public float getLoss() {
		return loss;
	}


	public void setLoss(float loss) {
		this.loss = loss;
	}


	@Override
	public String toString() {
		return "Sales [name=" + name + ", model=" + model + ", quantity=" + quantity + ", size=" + size
				+ ", selling_prize=" + selling_prize + ", buying_price=" + buying_price + ", reguar_price="
				+ reguar_price + ", profit=" + profit + ", loss=" + loss + ", getName()=" + getName() + ", getModel()="
				+ getModel() + ", getQuantity()=" + getQuantity() + ", getSize()=" + getSize() + ", getSelling_prize()="
				+ getSelling_prize() + ", getBuying_price()=" + getBuying_price() + ", getReguar_price()="
				+ getReguar_price() + ", getProfit()=" + getProfit() + ", getLoss()=" + getLoss() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
