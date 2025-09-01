import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // SingleInstance singleInstance1 = new SingleInstance();
        // SingleInstance singleInstance2 = new SingleInstance();

        // if (singleInstance1 == singleInstance2) {
        // System.out.println("Its working");
        // }

        // SingleInstance db = SingleInstance.createInstance();
        // SingleInstance d2 = SingleInstance.createInstance();
        // if (db == d2) {
        // System.out.println("They are same");
        // }
        // System.out.println(db.name);

        // final List<Integer> arr = new ArrayList<>();
        // arr.add(10);

        // ImmutableInstance immutableInstance = new
        // ImmutableInstance.ImmutableInstanceBuilder().setName("Luffy")
        // .setGame("One Piece").build();

        // Singleton_UsingEnum singleton_UsingEnum = Singleton_UsingEnum.INSTANCE;
        // Singleton_UsingEnum singleton_UsingEnum2 = Singleton_UsingEnum.INSTANCE;

        // if (singleton_UsingEnum == singleton_UsingEnum2) {
        // System.out.println("they are same");
        // }

        Singleton_UsingInnerClass singleton_UsingInnerClass1 = Singleton_UsingInnerClass.getInstance();
        Singleton_UsingInnerClass singleton_UsingInnerClass2 = Singleton_UsingInnerClass.getInstance();

        if (singleton_UsingInnerClass1 == singleton_UsingInnerClass2) {
            System.out.println("they are same");
        }
    }
}