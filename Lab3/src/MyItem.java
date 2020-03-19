public class MyItem implements Item,Comparable<MyItem> {
    protected String ItemName;

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getName() {
        return this.ItemName;
    }

    public boolean equals(MyItem I) {
        if (I == this) {
            return true;
        }

        if (!(I instanceof Item)) {
            return false;
        }else{
            return this.ItemName.compareTo(I.getName())>=0;
        }


    }

    @Override
    public int compareTo(MyItem myItem) {
        return this.ItemName.compareTo(myItem.getName());
    }
}
