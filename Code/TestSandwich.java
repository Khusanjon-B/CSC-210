public class TestSandwich {
    
    public static void main(String[] args)
    {
        
        Sandwich vegan = new Sandwich();

        vegan.setMainIngredient("Tomatoes, Cheese, and Basil");

        vegan.setBreadType("Garlic");

        vegan.setPrice(5.99);

        System.out.println("New Sandiwch Item");

        System.out.println("The new vegan sandwich consists of " + vegan.getMainIngredient());

        System.out.println("With " + vegan.getBreadType() + " bread.");

        System.out.println("Only at $" + vegan.getPrice());

    }

}
