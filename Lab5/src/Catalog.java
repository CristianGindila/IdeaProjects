import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Catalog implements Serializable {
    String name;

    List<Document> list = new LinkedList<Document>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Catalog(String name)
    {
        this.name=name;
    }

    public void addItem(Document item){
        list.add(item);
    }

    public void print() {
        ListIterator list_Iter = list.listIterator();
        while (list_Iter.hasNext()) {
            System.out.println(list_Iter.next());
        }
    }

}
