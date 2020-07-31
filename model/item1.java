package model;

import java.sql.Blob;

public class item1 {
	private String name,model;
	private Blob photo;

	
	public item1() {
		super();
	}


	public item1(String name, String model, Blob photo) {
		super();
		this.name = name;
		this.model = model;
		this.photo = photo;
	}


	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Blob getPhoto() {
		return photo;
	}


	public void setPhoto(Blob photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "item1 [name=" + name + ", model=" + model + ", photo=" + photo + ", getname()=" + getname()
				+ ", getModel()=" + getModel() + ", getPhoto()=" + getPhoto() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
