import java.util.TreeSet;

public class main {
    public static void main(String...args)
    {
        Resident R0 = new Resident("R0");//initializam datele
        Resident R1 = new Resident("R1");
        Resident R2 = new Resident("R2");
        Resident R3 = new Resident("R3");
        Hospital H0 = new Hospital("H0",1);
        Hospital H1 = new Hospital("H1",2);
        Hospital H2 = new Hospital("H2",2);
        R0.addPreferences(H0);//adaugam preferintele
        R0.addPreferences(H1);
        R0.addPreferences(H2);
        R1.addPreferences(H0);
        R1.addPreferences(H1);
        R1.addPreferences(H2);
        R2.addPreferences(H0);
        R2.addPreferences(H1);
        R3.addPreferences(H0);
        R3.addPreferences(H2);
        H0.addResident(R3);//adaugam rezidentii
        H0.addResident(R0);
        H0.addResident(R1);
        H0.addResident(R2);
        H1.addResident(R0);
        H1.addResident(R2);
        H1.addResident(R1);
        H2.addResident(R0);
        H2.addResident(R1);
        H2.addResident(R3);
        System.out.println(R0.toString()+R0.getPreferences());//afisam datele
        System.out.println(R1.toString()+R1.getPreferences());
        System.out.println(R2.toString()+R2.getPreferences());
        System.out.println(R3.toString()+R3.getPreferences());
        System.out.println("");
        H0.sort();//sortam h0 ce initial contine R3 R0 R1 R2
        System.out.println(H0.toString()+H0.getResidents());//afisam spitalele
        System.out.println(H1.toString()+H1.getResidents());
        System.out.println(H2.toString()+H2.getResidents());
        System.out.println("");
        Maps M = new Maps();//initializam clasa Maps
        M.addResidentMap(R0);//creem maps pentru Residenti
        M.addResidentMap(R1);
        M.addResidentMap(R2);
        M.addResidentMap(R3);
        M.printMap1();
        System.out.println("");
        M.addHospitalMap(H0);//creem maps pentru Hospitals
        M.addHospitalMap(H1);
        M.addHospitalMap(H2);
        M.printMap2();
        System.out.println("");
        Finder F = new Finder();//initializam clasa de find
        F.findHospital(R0.getPreferences(),R0);//afisam ultima cerinta
        F.findResident(H0.getResidents(),H0,H2);


    }
}
