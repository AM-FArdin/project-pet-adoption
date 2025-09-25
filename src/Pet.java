/**
 * Represents a pet in the system.
 * Demonstrates encapsulation.
 */
public class Pet {
    private String id;
    private String name;
    private String species;
    private String breed;
    private boolean available;

    public Pet(String id, String name, String species, String breed, boolean available) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.available = available;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getBreed() { return breed; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}