enum Weapons {
    Sword,
    Gun,
    Axe
}
public class Weapon extends MyItem {

    double weight;
    double value;

    public void setName(String name) {
        this.ItemName =Weapons.valueOf(name).toString();
    }

    Weapon(String name,double weight,double value)
    {this.ItemName = Weapons.valueOf(name).toString();
    this.weight=weight;
    this.value=value;

    }

    public String toString(){
        return "Weapon "+ ItemName + " weight " + weight + " value " + value +" profit factor " + profitFactor();
    }
    public String getName() {
        return this.ItemName;
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
