import zad1.Car;
import zad2.Item;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("zadanie 1");
        //zad1
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2015));
        cars.add(new Car("Ford", 2018));
        cars.add(new Car("Honda", 2012));
        cars.add(new Car("Chevrolet", 2019));
        cars.add(new Car("Tesla", 2020));
        cars.add(new Car("BMW", 2016));
        cars.add(new Car("Audi", 2014));
        cars.add(new Car("MercedesBenz", 2017));
        cars.add(new Car("Volkswagen", 2013));
        cars.add(new Car("Mazda", 2011));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }

        //zad2
        System.out.println();
        System.out.println("zadanie 2");
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "a"));
        itemList.add(new Item(2, "b"));
        itemList.add(new Item(3, "c"));
        itemList.add(new Item(4, "d"));
        itemList.add(new Item(5, "e"));

        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }

        HashMap<Integer, String> map = new HashMap<>();
        for (Item item : itemList) {
            map.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + "; Name: " + entry.getValue());
        }

        //zad3
        System.out.println();
        System.out.println("zadanie 3");
        ArrayList<Item> itemList2 = new ArrayList<>();
        itemList2.add(new Item(6, "f"));
        itemList2.add(new Item(7, "g"));
        itemList2.add(new Item(8, "h"));
        itemList2.add(new Item(9, "i"));
        itemList2.add(new Item(10, "j"));
        itemList2.add(new Item(11, "k"));
        itemList2.add(new Item(12, "l"));
        itemList2.add(new Item(13, "m"));
        itemList2.add(new Item(14, "n"));
        itemList2.add(new Item(15, "o"));

        List<Item> itemList3 = itemList2.subList(0, 5);

        LinkedHashSet<Item> itemSet = new LinkedHashSet<>(itemList3);

        for (Item item : itemSet) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
    }
}