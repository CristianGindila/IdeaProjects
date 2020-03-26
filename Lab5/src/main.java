public class main {
    public static void main(String...args) {
        Document D1 = new Document("", "https://www.york.ac.uk/teaching/cws/wws/webpage1.html", 1, "WebModel", "Unknown", "1999");
        Document D2 = new Document("Exemplu.txt", "", 2, "LocalModel1", "Unknown", "2020");
        Catalog C1 = new Catalog("Catalog1");
        C1.addItem(D1);
        C1.addItem(D2);
        C1.print();

        CatalogOperations serializer=new CatalogOperations();
        serializer.save(C1,"salvare1");

        View v1 = new View();

        Catalog C2;
        C2=serializer.load("salvare1");

        Save s1=new Save();
        s1.save(C1,"salvare2");
        Load l1=new Load();

        Catalog C3;
        C3=l1.load("salvare2");


    }



}
