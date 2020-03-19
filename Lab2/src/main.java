import java.util.Random;

abstract class abstractVehicle{
    public String vehicleName;

}




enum VehicleType {
    CAR, TRUCK, DRONE;
}
class Tour{
    public Tour(){

    }

}
class Problem{
    private Vehicles[] concat(Vehicles[] fst,Vehicles[] sec){
        Vehicles[] returnArray=new Vehicles[fst.length+sec.length];
        int i=0;
        for(Vehicles v :fst){
            returnArray[i]=v;
            i++;
        }

        for(Vehicles v :sec){
            returnArray[i]=v;
            i++;
        }
        return returnArray;
    }

    Vehicles[] getVehicles(Depots[] depots){

        Vehicles[] returnArray=null;
        for(Depots d : depots){
            if(returnArray==null){
                returnArray=d.getVehList();
            }else{
                Vehicles[] veh=d.getVehList();
                returnArray=concat(returnArray,veh);
            }

        }
        return returnArray;
    }
    public Problem(){

    }
}

class Vehicles{
    public Vehicles(String vehicleName){
        this.vehicleName=vehicleName;

    }
    private VehicleType vehT;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    public String toString(){
        return vehicleName;
    }
    private String vehicleName;
    public Vehicles(){

    }

    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Vehicles)) {
            return false;
        }
        Vehicles v=(Vehicles)o;
        if(v.vehicleName.equals(vehicleName) && v.vehT.equals(vehT)){
            return true;
        }else{
            return true;
        }
    }

}

class Trips{
    private static enum TripEnum{
        BlackLake,Viena,Paris,Berlin
    }

    public static TripEnum getTrip(){
        Random rand=new Random();
        return TripEnum.values()[Math.abs(rand.nextInt())%TripEnum.values().length];
    }

}


class Depots{
    public void setVehList(Vehicles[] vehList) {
        this.vehList = vehList;
    }

    private Vehicles[] vehList;

    public Vehicles[] getVehList() {
        return vehList;
    }


    public String getDepotsName() {
        return depotsName;
    }
    public String toString(){
        return depotsName;
    }
    public void setDepotsName(String depotsName) {
        this.depotsName = depotsName;
    }

    private String depotsName;
    public Depots(){

    }

    public Depots(String depotsName){
        this.depotsName = depotsName;

    }
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Clients)) {
            return false;
        }
        Depots d=(Depots)o;
        if(d.depotsName.equals(depotsName) ){
            return true;
        }else{
            return true;
        }
    }
}
class Clients{
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    private String clientName;

    public void setVisitingTime(int visitingTime) {
        this.visitingTime = visitingTime;
    }

    public int getVisitingTime() {
        return visitingTime;
    }

    private int visitingTime;
    public Clients(String clientName){
        this.clientName=clientName;
    }

    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Clients)) {
            return false;
        }
        Clients c=(Clients)o;
        if(c.clientName.equals(clientName) ){
            return true;
        }else{
            return true;
        }
    }

}




public class main {
    public static void main(String...args)
    {
        Depots D1 = new Depots("D1");
        Depots D2 = new Depots("D2");
        Vehicles V1 = new Vehicles("V1");
        Vehicles V2 = new Vehicles("V2");
        Vehicles V3 = new Vehicles("V3");
        Clients C1 = new Clients("C1");
        Clients C2= new Clients("C2");
        Clients C3 = new Clients("C3");
        Clients C4 = new Clients("C4");
        Clients C5 = new Clients("C5");
        C1.setVisitingTime(1);
        C1.setVisitingTime(1);
        C1.setVisitingTime(2);
        C1.setVisitingTime(2);
        C1.setVisitingTime(3);

    }
}
