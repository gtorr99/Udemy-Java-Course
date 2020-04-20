package javaCompletoPOO.entities.classes;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock(){
		return price * quantity;
	}

	public void addProducts(int addQuantity){
		this.quantity += addQuantity; 
	}

	public void removeProducts(int removeQuantity){
		this.quantity -= removeQuantity; 
	}
	
	public String toString() {
		return name
			   + ", $"
			   + String.format("%.2f", price)
			   + ", "
			   + quantity
			   + " units, Total: $ "
			   + String.format("%.2f",totalValueInStock());
	}
}
