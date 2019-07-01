package observer;

public class BCompany implements Observer{

    @Override
    public void getMeteorologicalStationData(float pressure, float temperature, float humidity) {
        System.out.println("B pressure: "+pressure+",temperature: "+temperature+",humidity: "+humidity);
    }

}
