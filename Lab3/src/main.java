

public class main {
    public static void main(String...args)
    {
        Knapsack K1 = new Knapsack(10);
        Book B1 = new Book("GOT", 2 ,200);
        Book B2 = new Book("Dragon Rising", 5 ,100);
        Food F1 = new Food("Apple", 1);
        Food F2 = new Food("Pear", 2);
        Weapon W1 = new Weapon( "Sword",1,1 );
        K1.addItem(B1);
        K1.addItem(B2);
        K1.addItem(F1);
        K1.addItem(F2);
        K1.addItem(W1);
        K1.sort();
        K1.print();


    }
}
