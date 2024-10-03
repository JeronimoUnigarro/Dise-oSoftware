package PackegeCircle;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el radio del circulo");
		double circleRadius = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Ingrese el color de circulo");
		String circleColor = scanner.nextLine();
		
		circle userCircle = new circle(circleRadius, circleColor);
		System.out.println(userCircle.toString());
		System.out.println("El area del circulo es: " + userCircle.getArea());
		
		 System.out.println("\nno has creado un cilindro.");
	     System.out.println("ingrese el radio del cilindro:");
	     double cylinderRadius = scanner.nextDouble();

	     System.out.println("ingrese la altura del cilindro:");
	     double cylinderHeight = scanner.nextDouble();
	     scanner.nextLine();  

	     System.out.println("ingrese el color del cilindro:");
	     String cylinderColor = scanner.nextLine();
	     
	     cylinder userCylinder = new cylinder(cylinderRadius, cylinderHeight, cylinderColor);
	     System.out.println("\nel cilindro: Radius = " + userCylinder.getRadius() + 
	                           ", altura = " + userCylinder.getHeight() + 
	                           ", color = " + userCylinder.getColor());
	     System.out.println("el volumen del cilindro: " + userCylinder.getVolume());

	      scanner.close();
		
		
		
		
		
    }
}

	

