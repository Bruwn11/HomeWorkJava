package Football;

public class Main {
    public static void main(String[] args) {
        Player player1 = Player.addPlayer();
        assert player1 != null;
        Player player2 = Player.addPlayer();
        assert player2 != null;
        Player player3 = Player.addPlayer();
        assert player3 != null;
        Player player4 = Player.addPlayer();
        assert player4 != null;
        Player player5 = Player.addPlayer();
        assert player5 != null;
        System.out.println(player1.getStamina());
        player1.run();
        System.out.println(player1.getStamina());
        System.out.println(player1.getName());
        Player.info();
        Player player6 = Player.addPlayer();
        assert player6 != null;
        Player.info();
    }
}
