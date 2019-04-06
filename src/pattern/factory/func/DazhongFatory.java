package pattern.factory.func;

import pattern.factory.ICar;

/**
 * 大众
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:41
 */
public class DazhongFatory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new DazhongCreator();
    }
}
