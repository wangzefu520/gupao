package factory.func;

import factory.ICar;

/**
 * 宝马
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:33
 */
public class BaomaCreator implements ICar {
    @Override
    public String brand() {
        return "baoma";
    }
}
