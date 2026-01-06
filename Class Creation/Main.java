public class Main {
    public static void main(String[] args) { 
        Dog myDog1 = new Dog(); 
        myDog1.name = "Buddy";
        myDog1.breed = "Golden Retriever";
        myDog1.age = 5;
      
        Dog myDog2 = new Dog();
        myDog2.name = "Lucy";
        myDog2.breed = "Poodle";
        myDog2.age = 3;

        System.out.println("--- First Dog's Info ---");
        System.out.println("Name: " + myDog1.name);
        System.out.println("Breed: " + myDog1.breed);
        myDog1.bark(); 
        myDog1.eat();

        System.out.println("\n--- Second Dog's Info ---");
        System.out.println("Name: " + myDog2.name);
        myDog2.bark(); 
    }
}
