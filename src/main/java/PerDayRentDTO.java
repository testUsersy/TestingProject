
public class PerDayRentDTO {

	private float price;
	
	private float discount;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "PerDayRentDTO [price=" + price + ", discount=" + discount + "]";
	}
	
	
	
}
