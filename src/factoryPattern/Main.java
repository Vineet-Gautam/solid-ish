package factoryPattern;

public class Main {
    public static void main(String[] args) {
        Pizza p = Factory.cookPizza("veg");
        p.prepare();
    }
}
