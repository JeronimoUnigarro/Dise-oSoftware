package pacakgeAnimal;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Animal
        System.out.println("Ingresa el nombre de un animal genérico:");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalName);
        System.out.println(animal);

        //  Mammal
        System.out.println("Ingresa el nombre de un mamífero genérico:");
        String mammalName = scanner.nextLine();
        Mammal mammal = new Mammal(mammalName);
        System.out.println(mammal);

        //  Cat
        System.out.println("Ingresa el nombre de un gato:");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);
        System.out.println(cat);
        System.out.println("El gato hace: ");
        cat.greets();

        //  Dog 1
        System.out.println("Ingresa el nombre del primer perro:");
        String dogName1 = scanner.nextLine();
        Dog dog1 = new Dog(dogName1);
        System.out.println(dog1);
        System.out.println("El perro hace: ");
        dog1.greets();

        //  Dog 2
        System.out.println("Ingresa el nombre del segundo perro:");
        String dogName2 = scanner.nextLine();
        Dog dog2 = new Dog(dogName2);
        System.out.println(dog2);
        System.out.println("El primer perro saluda al segundo perro: ");
        dog1.greets(dog2);

        scanner.close();
    }
}