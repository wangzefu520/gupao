package singleton;

public class LazySingletonOne {

    private static LazySingletonOne instance;

    public static LazySingletonOne getInstance() {
        if(null == instance){
            instance = new LazySingletonOne();
        }
        return instance;
    }
}
