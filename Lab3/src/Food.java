public class Food extends MyItem {

    double weight;
    double value;

    Food(String name , double weight){

        this.ItemName=name;
        this.weight=weight;
        value=weight*2;
    }

    public void setName(String name) {
        this.ItemName = name;
    }

    public String getName() {
        return ItemName;
    }

    public String toString(){
        return "Food "+ ItemName + " weight " + weight + " value " + value +" profit factor " + profitFactor();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
