package pattern.factory.simple;

import pattern.factory.ICar;

/**
 * 大众
 *
 * @author wangchuan
 * @datetime 2019/3/11 23:08
 */
public class Dazhong implements ICar {
    @Override
    public String brand() {
        return "大众";
    }
}
