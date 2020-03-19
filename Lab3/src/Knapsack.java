
import java.util.*;

public class Knapsack  {

    int capacity;
    List<MyItem> list = new LinkedList<MyItem>();

    Knapsack(int capacity)
    {
        this.capacity=capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addItem(MyItem item){
        list.add(item);

    }

    public int getCapacity() {
        return capacity;
    }


    public void print() {
        ListIterator list_Iter = list.listIterator();
        while (list_Iter.hasNext()) {
            System.out.println(list_Iter.next());
        }
    }

    public void sort()
    {
        Collections.sort(list);
    }

}
