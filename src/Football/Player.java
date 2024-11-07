package Football;

import java.util.Random;

public class Player {
    Random r = new Random();
    private final String name;
    private int stamina;
    private static final Integer MAX_STAMINA = 10;
    private static final Integer MIN_STAMINA = 0;
    private static Integer countPlayers = 0;
    private static Integer number = 0;

    private Player(){
        countPlayers++;
        number++;
        this.stamina = r.nextInt(MIN_STAMINA+6,MAX_STAMINA+1);
        this.name = "Игрок" + number;
    }
    public static Player addPlayer(){
        if(countPlayers>=6){
            System.out.println("На поле уже есть 6 игроков, больше не надо.");
            return null;
        }
        else {
            return new Player();
        }
    }

    public String getName(){
        return name;
    }
    public String getStamina() {
        return "Стамина " + name + " равна " + stamina;
    }
    public void run(){
        if(stamina>0){
            stamina--;
            System.out.println(name + " пробежал. " + "Выносливость стала равна " + stamina);
        }
        else{
            System.out.println(name + " устал и пошёл отдыхать.");
            countPlayers--;
        }
    }
    public static void info(){
        int freeSpace = 6 - countPlayers;
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле ещё есть " + freeSpace + " свободных мест.");
        }
        else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}
