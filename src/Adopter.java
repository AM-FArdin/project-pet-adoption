/**
 * Represents an adopter user.
 * Demonstrates inheritance from User.
 */
public class Adopter extends User {
    private int adoptedPets;

    public Adopter(String id, String name, String email) {
        super(id, name, email, "Adopter");
        this.adoptedPets = 0;
    }

    public int getAdoptedPets() { return adoptedPets; }
    public void setAdoptedPets(int adoptedPets) { this.adoptedPets = adoptedPets; }

    // Polymorphism: overriding giveFeedback
    @Override
    public String giveFeedback() {
        return "Adopter feedback: Thank you for helping me adopt a pet!";
    }
}