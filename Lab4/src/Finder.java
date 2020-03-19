import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Finder {

    public void findResident(List<Resident> residentList,Hospital H0,Hospital H2) {
        List<Resident> residents = residentList.stream()
                .filter(emp -> emp.getPreferences().contains(H0))
                .filter(emp -> emp.getPreferences().contains(H2))
                .collect(Collectors.toList());
        System.out.println(residents);
    }
    public void findHospital( TreeSet<Hospital> preferences,Resident R0) {
        List<Hospital> hospitals=preferences.stream()
                .filter(emp->emp.getResidents().get(0).equals(R0))
                .collect(Collectors.toList());
        System.out.println(hospitals);
    }
}
