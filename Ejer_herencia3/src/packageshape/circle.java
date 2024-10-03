package packageshape;

public class circle extends Shape {
	
	private double radius;

	public circle() {
		super();
	}

	public circle(double radius) {
		super();
		this.radius = radius;
	}

	public circle(String color, boolean fallied ,double radius) {
		super(color,fallied );
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*(radius*radius);
	}

	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[" + super.toString() + ", radius=" + radius + "]";
	}
	
	
	
	
}
