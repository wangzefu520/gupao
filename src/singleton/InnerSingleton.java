package singleton;

public class InnerSingleton {

    private InnerSingleton() {
    }

    private static class InstanceHolder {
        private static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
