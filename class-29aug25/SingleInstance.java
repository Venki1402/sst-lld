public class SingleInstance {
    String name;
    static SingleInstance original = new SingleInstance("luffy");

    private SingleInstance(String name) {
        this.name = name;
    }

}
