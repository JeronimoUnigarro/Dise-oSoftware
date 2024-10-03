package PackegeCircle;

public class cylinder extends circle {
	private double height = 1.0;

	public cylinder() {
	}

	public cylinder(double radius) {
		this.setRadius(radius);
	}

	public cylinder(double radius, double height) {
		this.height = height;
		this.setRadius( radius);
	}

	public cylinder(double radius, double height,String color) {
		this.height = height;
		this.setColor(color);
		this.setRadius(radius);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(getRadius(), 2) * height;
	}
	
}
