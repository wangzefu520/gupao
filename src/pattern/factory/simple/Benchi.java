package pattern.factory.simple;

import pattern.factory.ICar;

/**
 * 奔驰
 *
 * @author wangchuan
 * @datetime 2019/3/11 23:07
 */
public class Benchi implements ICar {
    @Override
    public String brand() {
        return "BC";
    }
}
