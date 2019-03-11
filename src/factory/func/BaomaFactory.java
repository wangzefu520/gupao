package factory.func;

import factory.ICar;

/**
 * 宝马工厂
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:36
 */
public class BaomaFactory implements ICarFactory {


    @Override
    public ICar createCar() {
        return new BaomaCreator();
    }
}
