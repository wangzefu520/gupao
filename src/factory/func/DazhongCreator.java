package factory.func;

import factory.ICar;

/**
 * 大众
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:34
 */
public class DazhongCreator implements ICar {
    @Override
    public String brand() {
        return "dazhong";
    }
}
