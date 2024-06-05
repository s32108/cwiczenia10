public class Car implements Comparable<Car>{
    String nazwaModelu;
    int rokProdukcji;

    public Car(String nazwaModelu, int rokProdukcji) {
        this.nazwaModelu = nazwaModelu;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.rokProdukcji, car.rokProdukcji);
    }
    public String toString(){
        return nazwaModelu +" ("+ rokProdukcji+ ")";
    }
}
