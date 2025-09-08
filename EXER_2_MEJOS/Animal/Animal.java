public class Animal {
    // Instance variables with private access modifier for encapsulation
    private String species;
    private String name;
    private String color;
    private String habitat;
    private String diet;

    // No-argument constructor (default values)
    public Animal() {
        this.species = "No Species";
        this.name = "No Name";
        this.color = "No Color";
        this.habitat = "No Habitat";
        this.diet = "No Diet";
    }

    // Parameterized constructor
    public Animal(String species, String name, String color, String habitat, String diet) {
        this.species = species;
        this.name = name;
        this.color = color;
        this.habitat = habitat;
        this.diet = diet;
    }

    // Method to display animal details
    public String displayInfo() {
        String info = "";
        info += "Species: " + this.species;
        info += "\nName: " + this.name;
        info += "\nColor: " + this.color;
        info += "\nHabitat: " + this.habitat;
        info += "\nDiet: " + this.diet;
        System.out.println(info + "\n");
        return info;
    }
}
