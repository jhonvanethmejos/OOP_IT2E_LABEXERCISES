public class AnimalTester {
    public static void main(String[] args) {
        // Using parameterized constructor with correct string literals
        Animal a1 = new Animal("Tiger", "Sheru", "Orange with black stripes", "Forest", "Carnivore");

        // Using no-argument constructor (default values)
        Animal a2 = new Animal("Tiger", "Sheru", "Orange with black stripes", "Forest", "Carnivore");

        // Display information for both animals
        a1.displayInfo();
        a2.displayInfo();
    }
}
