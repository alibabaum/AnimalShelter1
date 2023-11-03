public abstract class Dog implements AdoptableAnimal {
    abstract String getBreed();

    private String name;
    private String description;
    private double price;

    public Dog(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
