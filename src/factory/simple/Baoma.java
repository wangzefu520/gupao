package factory.simple;

import factory.ICar;

/**
 * 宝马
 *
 * @author wangchuan
 * @datetime 2019/3/11 23:06
 */
public class Baoma implements ICar {
    @Override
    public String brand() {
        return "BMW";
    }
}
