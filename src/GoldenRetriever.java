public class GoldenRetriever extends Dog {
    private String breed;


    public GoldenRetriever(String name, String description, Double price) {
        super(name, description, price);
        this.breed = "Golden Retriever";
    }

    public String getBreed() {
        return this.breed;
    }
}