package factoryPattern;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing veg pizza");
    }
}
