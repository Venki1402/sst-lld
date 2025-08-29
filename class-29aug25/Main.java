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

        ImmutableInstance immutableInstance = ImmutableInstance.ImmutableInstanceBuilder.setName("Luffy")
                .setGame("One Piece").build();

    }
}