package observer;

public class ACompany implements Observer{
    @Override
    public void getMeteorologicalStationData(float pressure,float temperature,float humidity){
        System.out.println("A pressure: "+pressure+",temperature: "+temperature+",humidity: "+humidity);
    }
}
