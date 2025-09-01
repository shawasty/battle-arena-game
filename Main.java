public class Main {
    public static void main(String[] args) {
        // Create two characters
        Character hero = new Character("Hero", 100);
        Character villain = new Character("Villain", 80);

        // Hero attacks villain
        hero.attack();
        villain.takeDamage(10);

        // Villain attacks hero
        villain.attack();
        hero.takeDamage(15);
    }
}