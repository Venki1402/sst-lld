public class SingleInstance {
    String name;
    static SingleInstance original;

    static SingleInstance createInstance() {
        if (original == null) {
            original = new SingleInstance("👑 King");
        }
        return original;
    }

    private SingleInstance(String name) {
        this.name = name;
    }

}
