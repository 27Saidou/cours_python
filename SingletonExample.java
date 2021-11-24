public class SingletonExample {
    private static SingletonExample singleObject;

    private SingletonExample() {
    }
    
    public static SingletonExample getInstance() {
        return singleObject;
    }
}
