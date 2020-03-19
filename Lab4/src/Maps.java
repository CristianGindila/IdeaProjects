import java.lang.reflect.Array;
import java.util.*;

public class Maps {
    Map<Resident, TreeSet<Hospital>> map=new LinkedHashMap<>();
    Map<Hospital, ArrayList<Resident>> map2=new HashMap<>();

    public Map<Hospital, ArrayList<Resident>> getMap2() {
        return map2;
    }

    public void setMap2(Map<Hospital, ArrayList<Resident>> map2) {
        this.map2 = map2;
    }

    public Map<Resident, TreeSet<Hospital>> getMap() {
        return map;
    }

    public void setMap(Map<Resident, TreeSet<Hospital>> map) {
        this.map = map;
    }

    public void addResidentMap(Resident r)
    {
        map.put(r, r.getPreferences());

    }

    public void addHospitalMap(Hospital h)
    {
        map2.put(h, (ArrayList<Resident>) h.getResidents());

    }

    public void printMap1() {
        Set< Map.Entry<Resident,TreeSet<Hospital>>> st= map.entrySet();
        for(Map.Entry<Resident,TreeSet<Hospital>> map:st)
        {
            System.out.print(map.getKey()+":");
            System.out.println(map.getValue());
        }
    }
    public void printMap2() {
        Set< Map.Entry<Hospital,ArrayList<Resident>>>st1= map2.entrySet();
        for(Map.Entry<Hospital,ArrayList<Resident>> me:st1)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}
