package Football;
import java.util.ArrayList;
import java.util.List;

public class Game  {
    private Integer countPlayers = 0;
    private static final int PLAYERS_ON_FIELD = 6;
    private final List<Player> players = new ArrayList<>();

    public void removePlayer(Player player){
        players.remove(player);
        countPlayers--;
        System.out.println("Удалён игрок " + player.getName());
    }
    public void addPlayer(String name) {
        if (countPlayers < PLAYERS_ON_FIELD) {
            countPlayers++;
            Player newPlayer = new Player(name,this);
            players.add(newPlayer);
            System.out.println("Введён новый игрок, всего - " + countPlayers);
        } else {
            System.out.println("Игроков уже 6, мест нет!");
        }
    }
    public void info() {
        if (countPlayers < PLAYERS_ON_FIELD) {
            System.out.println("Команды неполные. На поле ещё есть  " + (PLAYERS_ON_FIELD - countPlayers) + " мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void checkName(String name){
        boolean isPlayer = false;
        for (Player player : players) {
            if (player.getName().equals(name)) {
                isPlayer = true;
                break;
            }
        }
        if(isPlayer){
            System.out.println("Игрок по имени " + name + " есть на поле");
        }
        else {
            System.out.println("Игрока по имени " + name + " нет на поле");
        }
    }
}

