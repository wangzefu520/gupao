package pattern.singleton;

public class LazySingletonFour {
    private static LazySingletonFour instance;

    public static LazySingletonFour getInstance() {
        if(null == instance){
            synchronized (LazySingletonFour.class) {
                instance = new LazySingletonFour();
            }
        }
        return instance;
    }
}
