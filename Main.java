public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Warehouse w = new Warehouse("1", 1000, 100, "Columbus", "1234 W Northwood", "6142224034", "Kevin Dong");
        Member m = new Member("1", "Kevin", "Dong", "West 9th", "911", "madrid.1@osu.edu", "1/1/600", 10);
        System.out.println(m.getWarehouseDistance());
        System.out.println(w.getDroneCapacity());
    }
}