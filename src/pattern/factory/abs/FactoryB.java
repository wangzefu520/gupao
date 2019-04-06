package pattern.factory.abs;

/**
 * desc
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:50
 */
public class FactoryB extends AbstractFactory {
    @Override
    Device createIronDevice() {
        return new IronDeviceProductB();
    }

    @Override
    Device createPlasticDevice() {
        return new PlasticDeviceProductB();
    }
}
