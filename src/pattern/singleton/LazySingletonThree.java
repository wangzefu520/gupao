package pattern.singleton;

public class LazySingletonThree {

    private static LazySingletonThree instance;

    public static LazySingletonThree getInstance() {
        if(null == instance){
            synchronized (LazySingletonThree.class) {
                instance = new LazySingletonThree();
            }
        }
        return instance;
    }
}
