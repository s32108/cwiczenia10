import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item(111, "item1");
        Item item2 = new Item(222, "item2");
        Item item3 = new Item(333, "item3");
        Item item4 = new Item(444, "item4");
        Item item5 = new Item(555, "item5");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        HashMap<Integer, String> itemsHashMap = new HashMap<>();

        for (Item item : items) {
            itemsHashMap.put(item.getId(), item.getName());
        }
        System.out.println("Items map: " + itemsHashMap.entrySet());

        for (Map.Entry<Integer, String> entry : itemsHashMap.entrySet()) {
            System.out.println("Identyfikator przedmiotu: " + entry.getKey() + " Nazwa przedmiotu: " + entry.getValue());
        }

        //zad3

        Item item11 = new Item(1111, "item11");
        Item item12 = new Item(2222, "item12");
        Item item13 = new Item(3333, "item13");
        Item item14 = new Item(4444, "item14");
        Item item15 = new Item(5555, "item15");
        Item item16 = new Item(6666, "item16");
        Item item17 = new Item(7777, "item17");
        Item item18 = new Item(8888, "item18");
        Item item19 = new Item(9999, "item19");
        Item item20 = new Item(2020, "item20");

        items.add(item11);
        items.add(item12);
        items.add(item13);
        items.add(item14);
        items.add(item15);
        items.add(item16);
        items.add(item17);
        items.add(item18);
        items.add(item19);
        items.add(item20);

        List<Item> items2 = items.subList(0, 9);
        HashMap<Integer, String> itemHashListFirst = new HashMap<>();

        for (Item item : items2) {
            itemsHashMap.put(item.getId(), item.getName());
            itemHashListFirst.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemHashListFirst.entrySet()) {
            System.out.println("Identyfikator przedmiotu: " + entry.getKey() + " Nazwa przedmiotu: " + entry.getValue());
        }
    }
}