public class Item {
    Integer identyfikatorPrzedmiotu;
    String nazwa;

    public Item(int identyfikatorPrzedmiotu, String nazwa) {
        this.identyfikatorPrzedmiotu = identyfikatorPrzedmiotu;
        this.nazwa = nazwa;
    }

    public int getId() {
        return identyfikatorPrzedmiotu;
    }

    public String getName() {
        return nazwa;
    }

    public void show(){
        System.out.println(this.nazwa);
    }

}
