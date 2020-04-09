import java.util.ArrayList;
import java.util.List;

public class Game {
    int n;
    int m;
    private Board board;
    private List<Player> playerList=new ArrayList<>();
    private List<Thread> threadList=new ArrayList<>();

    public Game(int n, int m, List<String> names){
        this.n=n;
        this.m=m;
        init(names);
    }

    private void init(List<String> names) {
        board=new Board(n, m);
        for (String name:names){
            playerList.add(new Player(name, board));
        }
    }
    public void run(){
        int max_points=0;
        String winner = "";
        for (Player player : playerList){
            threadList.add(new Thread(player));
        }
        for (Thread t : threadList){
            t.start();
        }
        try {
            for (Thread t : threadList) {
                t.join();
            }
        }
        catch (InterruptedException ex){
            System.out.println("Error!");
            return;
        }
        int points;
        boolean flag=false;
        for (Player player : playerList){
            if (flag)
                points=0;
            else{
                points=player.getPoints();
                if (points==-1){
                    points=n;
                    flag=true;
                }

            }
            System.out.println(player.getName() + "  punctaj:  "+points + " cu piesele " + player.getTokens());
            if(points>max_points)
            {
                max_points=points;
                winner=player.getName();
            }

        }
        System.out.println("Castigatorul este: "+winner+" cu punctajul "+max_points);
    }
}
