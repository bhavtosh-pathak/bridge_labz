package Class;

class Product {
   
    String productName;
    double price;

    static int totalProducts = 0;

   
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    void displayProductDetails() {
        System.out.println("Product Name= " + productName +
                           ", Price= " + price);
    }

 
    static void displayTotalProducts() {
        System.out.println("Total Products = " + totalProducts);
    }

  
    public static void main(String[] args) {
        Product p1 = new Product("Macbook", 50000.0);
        Product p2 = new Product("SmartphoneS", 20000.0);
        Product p3 = new Product("Headphone", 2900.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

       
        Product.displayTotalProducts();
    }
}

