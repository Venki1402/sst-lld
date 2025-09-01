public class Singleton_UsingInnerClass {
    
    private Singleton_UsingInnerClass() {
        System.out.println("Singleton_UsingInnerClass created!");
    }

    private static class SingletonHelper {
        private static final Singleton_UsingInnerClass INSTANCE = new Singleton_UsingInnerClass();
    }

    public static Singleton_UsingInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
