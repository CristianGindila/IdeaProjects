public class Game {
    Player player1;
    Player player2;

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }



    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    private boolean haveWinner()
    {

        return true;
    }

    private boolean play(Game game) throws InterruptedException {
        if(game.haveWinner())
        {
            System.out.println("Joc incheiat");
            return false;
        }
        return true;



}
}
