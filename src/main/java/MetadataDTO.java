
public class MetadataDTO {

	private String Color;
	
	private String notes;
	

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public String getNotes() {
		return notes;
	}

	@Override
	public String toString() {
		return "MetadataDTO [Color=" + Color + ", notes=" + notes + "]";
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
