public class Book extends MyItem {
    int pages;
    double weight;
    double value;

    Book(String name,double value ,int pages)
    {this.ItemName=name;
    this.value=value;
    this.weight=pages/100;

    }
    public String toString(){
        return "Book "+ ItemName + " weight " + weight + " value " + value +" profit factor " + profitFactor();
    }

    public void setName(String name) {
        this.ItemName = name;
    }

    public String getName() {
        return ItemName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }




}
