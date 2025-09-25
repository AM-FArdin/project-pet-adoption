/**
 * Represents a shelter manager user.
 * Demonstrates inheritance from User and polymorphism.
 */
public class ShelterManager extends User {
    private String shelterId;

    public ShelterManager(String id, String name, String email, String shelterId) {
        super(id, name, email, "ShelterManager");
        this.shelterId = shelterId;
    }

    public String getShelterId() { return shelterId; }
    public void setShelterId(String shelterId) { this.shelterId = shelterId; }

    // Polymorphism: overriding giveFeedback
    @Override
    public String giveFeedback() {
        return "Shelter Manager feedback: Shelter operations running smoothly.";
    }
}