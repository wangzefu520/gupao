package singleton;

public class LazySingletonTwo {

    private static LazySingletonTwo instance;

    public static synchronized LazySingletonTwo getInstance() {
        if(null == instance){
            instance = new LazySingletonTwo();
        }
        return instance;
    }
}
