import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Яблоко");
        fruits.add("Персик");
        fruits.add("Апельсин");


        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        System.out.println();

        Iterator<String>fruitsIterator = fruits.iterator();

        while (fruitsIterator.hasNext()) {
            System.out.println(fruitsIterator.next());
        }
        System.out.println();

        System.out.println("Фрукты:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
