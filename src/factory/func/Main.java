package factory.func;

/**
 * desc
 *
 * @author wangchuan
 * @datetime 2019/3/12 0:42
 */
public class Main {
    public static void main(String[] args) {
        ICarFactory carFactory = new BaomaFactory();
        carFactory.createCar();
    }
}
