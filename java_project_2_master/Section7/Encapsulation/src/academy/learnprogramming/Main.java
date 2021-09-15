package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "James";
//        player.health = 10;
//        player.weapon = "Axe";
//
//        int damage = 9;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 1;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("James", 150, "Axe");
        System.out.println("Initial health is " + player.getHealth());
    }
}
