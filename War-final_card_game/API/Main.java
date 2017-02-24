public class MainAPI {

    public static void main (String[] args) {
        Game game = War.main(String[] args);
        WarDisplay.main(game);
    }
}