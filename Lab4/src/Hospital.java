import java.util.*;

public class Hospital implements Comparable<Hospital> {
    int capacity;
    String name;
    List<Resident> residents=new ArrayList<Resident>();

    public void sort()
    {
        Collections.sort(residents, new Comparator<>() {
            public int compare(Resident r1, Resident r2) {
                return r1.getName().compareTo(r2.getName());
            }
        });
    }


    public List<Resident> getResidents() {
        return residents;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Hospital(String name, int capacity)
    {
        this.name=name;
        this.capacity=capacity;
    }

    public void addResident(Resident r)
    {
        residents.add(r);
    }

    public String toString(){
        return name;
    }


    @Override
    public int compareTo(Hospital hospital) {//necesar pentru utilizarea Comparable
        if(capacity==hospital.capacity && name==hospital.name)
            return 0;
        else if(capacity<hospital.capacity)
            return 1;
        else
            return -1;
    }
}
