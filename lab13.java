public class FruitBasket {
    // Fields
    private String fruitName;
    private String fruitColor;

    // Constructor
    public FruitBasket(String fruitName, String fruitColor) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }

    // Method to describe the fruit
    public String whichFruit() {
        return "This fruit is a " + fruitColor + " colored " + fruitName + ".";
    }

    // Method to compare two FruitBasket objects
    public boolean sameFruit(FruitBasket otherFruit) {
        if (otherFruit == null) return false;
        return this.fruitName.equalsIgnoreCase(otherFruit.fruitName)
            && this.fruitColor.equalsIgnoreCase(otherFruit.fruitColor);
    }

    // Main method for testing
    public static void main(String[] args) {
        FruitBasket apple = new FruitBasket("Apple", "Red");
        FruitBasket banana = new FruitBasket("Banana", "Yellow");
        FruitBasket anotherApple = new FruitBasket("apple", "red");

        System.out.println(apple.whichFruit());
        System.out.println(banana.whichFruit());

        System.out.println("apple vs banana: " + apple.sameFruit(banana));      // false
        System.out.println("apple vs anotherApple: " + apple.sameFruit(anotherApple));  // true
    }
}
