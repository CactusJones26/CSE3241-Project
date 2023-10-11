public class Main {
    public static void main(String[] args) {
        Data newData = new Data();
        System.out.println("Hello World!");
        Warehouse w = new Warehouse("1", 1000, 100, "Columbus", "1234 W Northwood", "6142224034", "Kevin Dong");
        newData.addWarehouse(w);
        Member m = new Member("1", "Kevin", "Dong", "West 9th", "911", "madrid.1@osu.edu", "1/1/600", 10);
        newData.addMember(m);
        Review r = new Review(1, "1", "Was decent,", 5, "10/22/2023", "Equipment Usage");
        m.addUserReview(r);
        System.out.println(newData.getWarehouse("1").getDroneCapacity());
        System.out.println(newData.getMember("1").getEmail());
        System.out.println(newData.getMember("1").getReview(1).getComment());
    }
}