package factoryPattern;

public class Factory {
    public static Pizza cookPizza(String type) {
        if(type.equalsIgnoreCase("veg")) {
            return new VegPizza();
        } else if(type.equalsIgnoreCase(("nonveg"))) {
            return new NonvegPizza();
        } else {
            throw new IllegalArgumentException("No type called " + type);
        }

    }
}
