import java.util.*;

public class Resident {
    Set preferences= new TreeSet<Hospital>();
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<Hospital> getPreferences() {
        return (TreeSet<Hospital>) preferences;
    }

    public void setPreferences(TreeSet<Hospital> preferences) {
        this.preferences = preferences;
    }

    public Resident(String name)
    {
        this.name=name;
    }
    public void addPreferences(Hospital h)
    {
        preferences.add(h);
    }

    public String toString(){
        return name;
    }



}
