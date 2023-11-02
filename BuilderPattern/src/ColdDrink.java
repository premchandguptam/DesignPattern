public abstract class ColdDrink implements Item {
// Create abstract classes implementing item interface providing default functionalities.
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
