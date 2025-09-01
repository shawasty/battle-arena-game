public class Character {
    // Declare variables for Character
    private String name;
    private int health;

    // constuctor for Character
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // method for attack

    void attack() {
        System.out.println(name + "attcks with bare hands! ");
    }

    // method to reduce health of a character
    void takeDamage(int damage) {
        health -= damage; // subtract the damage from the current health
        System.out.println(name + " takes " + damage + " damage. Health left: " + health);
    }

    // Getter method: lets us check a character's health safely.
    int getHealth() {
        return health;
    }

    // Getter method: lets us check a character's name safely.
    String getName() {
        return name;
    }
}
