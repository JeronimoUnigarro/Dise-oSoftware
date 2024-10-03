package PackagePerson;

public class student extends person {
	private String program;
	private int year;
	private double feet;
	public student(String name, String address, String program, int year, double feet) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.feet = feet;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFeet() {
		return feet;
	}
	public void setFeet(double feet) {
		this.feet = feet;
	}
	@Override
	public String toString() {
		return " program = " + program + ", year = " + year + ", feet = " + feet ;
	}
	
	
	
	
	
	
	

}
