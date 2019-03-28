
public class CarDTO {

	private String make;
	
	private String model;
	
	private String vin;
	
	private MetadataDTO metadata;
	
	private PerDayRentDTO perdayrent;
	
	private MetricsDTO metrics;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public MetadataDTO getMetadata() {
		return metadata;
	}

	public void setMetadata(MetadataDTO metadata) {
		this.metadata = metadata;
	}

	public PerDayRentDTO getPerdayrent() {
		return perdayrent;
	}

	public void setPerdayrent(PerDayRentDTO perdayrent) {
		this.perdayrent = perdayrent;
	}

	public MetricsDTO getMetrics() {
		return metrics;
	}

	public void setMetrics(MetricsDTO metrics) {
		this.metrics = metrics;
	}

	@Override
	public String toString() {
		return "CarDTO [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perdayrent="
				+ perdayrent + ", metrics=" + metrics + "]";
	}
	
	

	
}
