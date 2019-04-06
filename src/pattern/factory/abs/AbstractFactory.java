package pattern.factory.abs;

/**
 * desc
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:49
 */
public abstract class AbstractFactory {

    abstract Device createIronDevice();
    abstract Device createPlasticDevice();
}
