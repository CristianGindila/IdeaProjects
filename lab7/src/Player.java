import java.util.LinkedList;
import java.util.List;

public class Player implements Runnable {
    String name;
    List<Token> list = new LinkedList<Token>();

    public List<Token> getList() {
        return list;
    }

    public void setList(List<Token> list) {
        this.list = list;
    }



    public void addItem(Token item){
        list.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Player(String name){
        this.name=name;
    }

    @Override
    public void run() {
        try {
            while(this.play())
            {
                System.out.println("["+this.name+"]: Alege un token");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
    }

    }


}




