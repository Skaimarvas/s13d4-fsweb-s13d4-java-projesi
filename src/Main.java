public class Main {
    public static void main(String[] args) {

        System.out.println("*********************Point******************************");
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("distance(0,0):"+first.distance());
        System.out.println("distance(second):"+first.distance(second));
        System.out.println("distance(2,2):"+first.distance(2,2));

        Point point = new Point(0,0);
        System.out.println("Point distance(0,0): "+ point.distance());

        System.out.println("************************Player********************");
        Player player1 = new Player("Dante",200, Player.Weapon.SWORD);
        System.out.println(player1);
        System.out.println("Health Remaining: " + player1.healthRemaining() );
        player1.loseHealth(36);
        System.out.println("After Damage: " + player1.healthRemaining() );
        player1.restoreHealth(25);
        System.out.println("After Heal: " + player1.healthRemaining());
        player1.loseHealth(200);
        System.out.println("After Damage: " + player1.healthRemaining() );
        player1.restoreHealth(300);
        System.out.println("After Damage: " + player1.healthRemaining() );
    }
}