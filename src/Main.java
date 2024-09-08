public class Main {
    public static void main(String[] args) {
             System.out.println("OOP - Encapsulation!");
//        System.out.println("This demonstration isn't the real encapsulation");
//        Player player = new Player();
//        player.name ="Jeff";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200; // not encapsulated properly. direct access to data
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,"Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
