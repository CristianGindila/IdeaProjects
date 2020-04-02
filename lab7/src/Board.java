import java.util.LinkedList;
import java.util.List;

public class Board {

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


}
