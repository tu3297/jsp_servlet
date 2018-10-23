package Entity;

public class Car {
    private String marker;
    private String model;
    private String manufact;
    private String note;
    private String color;
	@Override
	public String toString() {
		return "Car [marker=" + marker + ", model=" + model + ", manufact=" + manufact + ", note=" + note + ", color="
				+ color + "]";
	}
	public Car(String marker, String model, String manufact, String note, String color) {
		super();
		this.marker = marker;
		this.model = model;
		this.manufact = manufact;
		this.note = note;
		this.color = color;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
