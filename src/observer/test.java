package observer;

/**
 * 观察者模式
 */
public class test {
    public static void main(String[] args) {
        ACompany aCompany = new ACompany();
        BCompany bCompany = new BCompany();
        MeteorologicalStation ms = new MeteorologicalStation();
        ms.registerObserver(aCompany);
        ms.registerObserver(bCompany);
        ms.uploadData(120,24,30);

        /**
         * 使用公共方法进行添加数据
         */
        ms.removeObserver(aCompany);
        ms.uploadData(120,24,30);
    }
}
