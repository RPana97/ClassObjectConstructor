public class Product {
    private String productName;
    private double cost;
    private int quantity;

    public Product (String productName, double cost, int quantity ) {
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void totalCost (){
        double total = cost * quantity;
        System.out.println ("Total cost is: " + total);
    }

    public void printProduct () {
        System.out.println(productName + " costs $" + cost + " and " + quantity + " units were purchased.");
    }

    public static void main(String[] args) {
        // Instantiate a Product object
        Product product = new Product("Laptop", 1000.0, 3);

        // Call the printProduct() and totalCost() methods
        product.printProduct();  // Should print: Product: Laptop, Cost per unit: $1000.0, Quantity: 3
        product.totalCost();     // Should print: Total cost for 3 units of Laptop is: $3000.0
    }

}
