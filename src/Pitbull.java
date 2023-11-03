public class Pitbull extends Dog {
    private String breed;

    public void setBreed(String breed) {
        this.breed = "Pitbull";
    }

    public Pitbull(String name, String description, Double price) {
        super(name, description, price);
        this.breed = "Pitbull";
    }

    public String getBreed() {
        return breed;
    }
}
