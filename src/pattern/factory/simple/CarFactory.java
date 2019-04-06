package pattern.factory.simple;

import pattern.factory.ICar;

/**
 * 车工厂
 *
 * @author wangchuan
 * @datetime 2019/3/11 23:09
 */
public class CarFactory {
    /**
     * 创建汽车
     * @param brand
     * @return
     */
    public static ICar createCar(String brand) {
        if("BMW".equals(brand)) {
            return new Baoma();
        } else if("BC".equals(brand)) {
            return new Benchi();
        } else {
            return new Dazhong();
        }
    }
}
