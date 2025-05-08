package factoryPattern;

public class NonvegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing non veg pizza");
    }
}
