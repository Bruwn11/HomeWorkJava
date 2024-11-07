package Football;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getPlayers());
        game.info();

        game.addPlayer("Василий");
        game.addPlayer("Алексей");
        game.addPlayer("Николай");


        System.out.println(game.getPlayers());
        game.addPlayer("Михаил");
        game.addPlayer("Александр");
        game.addPlayer("Василий");
        System.out.println(game.getPlayers());


        game.addPlayer("Борис");

        game.getPlayers().get(2).runFullStamina();
        game.info();

        game.getPlayers().get(4).runFullStamina();
        game.info();

        game.checkName("Александр");
        game.checkName("Николас");
    }
}
