import java.util.Arrays;

public class main {
    public static void main(String[] args){
        String[] players = new String[] {"player1", "player2", "player3"};
        Game game=new Game(40, 10, Arrays.asList(players));
        game.run();
    }
}
