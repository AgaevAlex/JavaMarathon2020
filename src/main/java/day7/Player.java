package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_PLAYERS = 6;
    private static int countPlayers;

    public Player(int stamina) {
        if (stamina <= MAX_STAMINA && stamina > MIN_STAMINA && countPlayers <= MAX_PLAYERS - 1) {
            this.stamina = stamina;
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void run() {
        if (stamina <= MAX_STAMINA && stamina > MIN_STAMINA) {
            if (--stamina == 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < MAX_PLAYERS - 1) {
            System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) + " свободных мест");
        } else if (countPlayers == MAX_PLAYERS - 1) {
            System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) + " свободное место");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
