/**
 * Demonstrates usage of core classes and OOP concepts.
 */
public class Main {
    public static void main(String[] args) {
        User genericUser = new User("U001", "Alice", "alice@example.com", "User");
        Adopter adopter = new Adopter("U002", "Bob", "bob@example.com");
        ShelterManager manager = new ShelterManager("U003", "Carol", "carol@example.com", "S001");
        Pet pet = new Pet("P001", "Buddy", "Dog", "Golden Retriever", true);

        // Encapsulation
        System.out.println("Adopter Name: " + adopter.getName());
        adopter.setAdoptedPets(2);
        System.out.println("Pets adopted: " + adopter.getAdoptedPets());

        // Inheritance
        System.out.println("Manager's shelter: " + manager.getShelterId());

        // Pet example
        System.out.println("Pet available: " + pet.isAvailable());
        pet.setAvailable(false);
        System.out.println("Pet available (after update): " + pet.isAvailable());

        // Polymorphism: giveFeedback() behaves differently for each class
        User[] users = {genericUser, adopter, manager};
        for (User u : users) {
            System.out.println(u.giveFeedback());
        }
    }
}