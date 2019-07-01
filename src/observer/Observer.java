package observer;

/**
 * 通过该接口，每个想要接入的公司实现该方法即可。
 */
public interface Observer {
    void getMeteorologicalStationData(float pressure,float temperature,float humidity);
}