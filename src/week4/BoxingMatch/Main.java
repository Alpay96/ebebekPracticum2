package week4.BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 20);
        Fighter alex = new Fighter("Alex", 10, 100, 95, 25);
        Ring ring = new Ring(marc, alex, 80, 95);
        ring.fight();
    }
}
