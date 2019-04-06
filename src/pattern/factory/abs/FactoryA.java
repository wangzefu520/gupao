package pattern.factory.abs;

/**
 * desc
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:50
 */
public class FactoryA extends AbstractFactory {
    @Override
    Device createIronDevice() {
        return new IronDeviceProductA();
    }

    @Override
    Device createPlasticDevice() {
        return new PlasticDeviceProductA();
    }
}
