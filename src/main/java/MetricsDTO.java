
public class MetricsDTO {

	private float yoyMaintenanceCost;
	
	private float depreciation;
	
	private RentalCountDTO rentalcount;

	public float getYoyMaintenanceCost() {
		return yoyMaintenanceCost;
	}

	public void setYoyMaintenanceCost(float yoymaintenancecost) {
		this.yoyMaintenanceCost = yoymaintenancecost;
	}

	public float getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(float depreciation) {
		this.depreciation = depreciation;
	}

	public RentalCountDTO getRentalcount() {
		return rentalcount;
	}

	public void setRentalcount(RentalCountDTO rentalcount) {
		this.rentalcount = rentalcount;
	}

	@Override
	public String toString() {
		return "MetricsDTO [yoyMaintenanceCost=" + yoyMaintenanceCost + ", depreciation=" + depreciation
				+ ", rentalcount=" + rentalcount + "]";
	}
	
	
	
	 
}
