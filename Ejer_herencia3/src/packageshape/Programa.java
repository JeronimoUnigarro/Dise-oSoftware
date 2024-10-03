package packageshape;
import java.util.Scanner;
public class Programa {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Shape básico
	        System.out.println("Creando una figura...");
	        System.out.print("Ingrese el color: ");
	        String shapeColor = scanner.nextLine();
	        System.out.print("¿La figura está rellena? (true/false): ");
	        boolean shapeFilled = scanner.nextBoolean();
	        Shape shape = new Shape(shapeColor, shapeFilled);
	        System.out.println(shape);

	        // Circle
	        System.out.println("\nCreando un Círculo...");
	        System.out.print("Ingrese el radio: ");
	        double circleRadius = scanner.nextDouble();
	        System.out.print("Ingrese el color: ");
	        scanner.nextLine();  
	        String circleColor = scanner.nextLine();
	        System.out.print("¿El círculo está relleno? (true/false): ");
	        boolean circleFilled = scanner.nextBoolean();
	        circle circle = new circle( circleColor, circleFilled , circleRadius);
	        System.out.println(circle);
	        System.out.println("Área del Círculo: " + circle.getArea());
	        System.out.println("Perímetro del Círculo: " + circle.getPerimeter());

	        // Rectangle
	        System.out.println("\nCreando un Rectángulo...");
	        System.out.print("Ingrese el ancho: ");
	        double rectangleWidth = scanner.nextDouble();
	        System.out.print("Ingrese el largo: ");
	        double rectangleLength = scanner.nextDouble();
	        System.out.print("Ingrese el color: ");
	        scanner.nextLine();  
	        String rectangleColor = scanner.nextLine();
	        System.out.print("¿El rectángulo está relleno? (true/false): ");
	        boolean rectangleFilled = scanner.nextBoolean();
	        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength, rectangleColor, rectangleFilled);
	        System.out.println(rectangle);
	        System.out.println("Área del Rectángulo: " + rectangle.getArea());
	        System.out.println("Perímetro del Rectángulo: " + rectangle.getPerimeter());

	        // Square
	        System.out.println("\nCreando un Cuadrado...");
	        System.out.print("Ingrese el lado del cuadrado: ");
	        double squareSide = scanner.nextDouble();
	        System.out.print("Ingrese el color: ");
	        scanner.nextLine();  
	        String squareColor = scanner.nextLine();
	        System.out.print("¿El cuadrado está relleno? (true/false): ");
	        boolean squareFilled = scanner.nextBoolean();
	        Square square = new Square(squareSide, squareColor, squareFilled);
	        System.out.println(square);
	        System.out.println("Área del Cuadrado: " + square.getArea());
	        System.out.println("Perímetro del Cuadrado: " + square.getPerimeter());

	        // Actualizar lado del Cuadrado
	        System.out.print("\nActualice el lado del Cuadrado: ");
	        double updatedSquareSide = scanner.nextDouble();
	        square.setSide(updatedSquareSide);
	        System.out.println("Cuadrado Actualizado: " + square);
	        System.out.println("Área del Cuadrado Actualizado: " + square.getArea());
	        System.out.println("Perímetro del Cuadrado Actualizado: " + square.getPerimeter());

	        scanner.close();
	    }
	}
