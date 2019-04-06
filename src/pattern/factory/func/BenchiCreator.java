package pattern.factory.func;

import pattern.factory.ICar;

/**
 * 奔驰
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:33
 */
public class BenchiCreator implements ICar {
    @Override
    public String brand() {
        return "benchi";
    }
}
