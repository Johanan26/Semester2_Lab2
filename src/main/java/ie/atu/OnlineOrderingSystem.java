package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
       //create an array or list of menuItem objects
        MenuItem[] menuItems = new MenuItem[]{
          //Add menu items
                new Burger("Big MAC",5.50,"pickles, lettuce, ketchup."),
                new Burger("5 oz bacon and cheese",6.50,"bacon, lettuce, cheese, burger sauce."),
                new Burger("Chicken Burger",5.00,"lettuce, garlic mayo."),

                new Pizza("Pepperoni",6.50,"pepperoni and pizza sauce."),
                new Pizza("Hawaiian",6.00,"pineapple,Ham, Pizza sauce."),
                new Pizza("cheese",5.50,"Cheese and pizza sauce."),

                new Salad("ceasar salad",5.00,"lettuce,chicken and parma cheese."),
                new Salad("Fruit salad",4.00,"watermelon, pineapple, grape ."),
                new Salad("Potato salad",4.50,"potato, onion, mayo."),
        };

        //Display details of each menu item
        for (MenuItem menuItem : menuItems){
            //print out the Name, Description and price dor each item
            System.out.println("Name: "+ menuItem.getName() + "Description: " +menuItem.getDescription()+ "Price: " + menuItem.getPrice() );
        }

        //Calculate and display the total cost of an order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            //totalCost of all menuIteam prices in an Order

        }
        System.out.println("Total Cost: £" + totalCost);
    }
}