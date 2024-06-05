package zad2;

public class Item implements Comparable<Item>{
    private int id;
    public String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Item: " + name);
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.id, other.id);
    }
}
