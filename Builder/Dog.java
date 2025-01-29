package Builder;

public class Dog {
    private String breed;
    private String gender;
    private String name;
    private double price;
    private boolean isVaccinated;

    Dog (DogBuilder dogBuilder) {
        this.breed = dogBuilder.getBreed();
        this.gender = dogBuilder.getGender();
        this.name = dogBuilder.getGender();
        this.price = dogBuilder.getPrice();
        this.isVaccinated = dogBuilder.isVaccinated();
    }

    public static class DogBuilder {
        private String breed;
        private String gender;
        private String name;
        private double price;
        private boolean isVaccinated;

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public boolean isVaccinated() {
            return isVaccinated;
        }

        public DogBuilder setVaccinated(boolean vaccinated) {
            isVaccinated = vaccinated;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String toString() {
        return this.breed + " " + this.price;
    }
}
