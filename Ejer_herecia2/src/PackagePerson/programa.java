package PackagePerson;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//class person 
	System.out.println("Ingrese el nombre:  ");
	String username = scanner.nextLine();
	
	System.out.println("Ingrese la direccion: ");
	String useraddress = scanner.nextLine();	
	
	person userperson = new person(username , useraddress);
	System.out.println("Persona creada: "+ userperson.toString());
	
	
//class student 
	
	System.out.println("Ingrese el programa de estudiante: ");
	String studentProgram = scanner.nextLine();
	
	System.out.println("Ingrese la edad del estudiante: ");
	int studentYear = scanner.nextInt();
	
	System.out.println("Ingrese el tamaño de pies del estudiante: ");
	double studentFeet = scanner.nextDouble();
	
	scanner.nextLine();
	
	student userstudent = new student(username, useraddress, studentProgram , studentYear, studentFeet );
	System.out.println("la informaicon del estudiante: "+ username + " es "+userstudent.toString());
	
	
	//class staff 
	
	System.out.println("Ingrese la escuela donde estudio ");
	String staffschool = scanner.nextLine();
	
	System.out.println("Ingrese su salario: ");
	double staffpay = scanner.nextDouble();
	
	staff userstaff = new staff(username,useraddress,staffschool, staffpay );
	System.out.println(userstaff.toString());
	
	
	scanner.close();
	
	
	
	
	
	}

}
