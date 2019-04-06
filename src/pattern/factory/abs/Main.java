package pattern.factory.abs;

/**
 * desc
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:53
 */
public class Main {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Device ironDevice = factoryA.createIronDevice();
        Device plasticDevice = factoryA.createPlasticDevice();

        FactoryB factoryB = new FactoryB();
        ironDevice = factoryB.createIronDevice();
        plasticDevice = factoryB.createPlasticDevice();

    }
}
