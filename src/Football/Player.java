package Football;

import java.util.Random;

public class Player {
    private final Game game;
    Random r = new Random();
    private final String name;
    private int stamina;
    private static final Integer MAX_STAMINA = 10;
    private static final Integer MIN_STAMINA = 0;

    Player(String name, Game game) {
        this.stamina = r.nextInt(MIN_STAMINA + 6, MAX_STAMINA + 1);
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 1) {
            stamina--;
            System.out.println(name + " пробежал. " + "Выносливость стала равна " + stamina);
        } else if (stamina == 1) {
            stamina--;
            System.out.println(name + " пробежал. " + "Выносливость стала равна " + stamina);
            game.removePlayer(this);
        } else {
            game.removePlayer(this);
        }
    }

    @Override
    public String toString() {
        return "Игрок{" +
                ", имя='" + name + '\'' +
                ", выносливость=" + stamina +
                '}';
    }

    public static Integer getMaxStamina() {
        return MAX_STAMINA;
    }
    public void runFullStamina(){
        int x = game.getPlayers().indexOf(this);
        Player player = game.getPlayers().get(x);
        for(int i = 0; i < Player.getMaxStamina(); i++){
            if(player.getStamina() > 0){
                player.run();
            }else {
                break;
            }
        }
    }
}
