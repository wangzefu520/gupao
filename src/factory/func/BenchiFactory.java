package factory.func;

import factory.ICar;

/**
 * 奔驰
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:41
 */
public class BenchiFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BenchiCreator();
    }
}
