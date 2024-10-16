import java.sql.SQLException;
import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDao productDAO = new ProductDao();
        int choice;

        do {
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Product
                    scanner.nextLine();
                    System.out.print("Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Category ID: ");
                    int categoryId = scanner.nextInt();
                    System.out.print("Supplier ID: ");
                    int supplierId = scanner.nextInt();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(name, categoryId, supplierId, quantity, price);

                    try {
                        productDAO.addProduct(product);
                        System.out.println("Product added successfully!");
                    } catch (SQLException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    // View All Products
                    try {
                        productDAO.getAllProducts().forEach(prod -> System.out.println(prod.getName() + " - " + prod.getQuantity()));
                    } catch (SQLException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Update Product
                    // Similar code as Add Product, but prompt for Product ID to update.
                    break;

                case 4:
                    // Delete Product
                    System.out.print("Product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    try {
                        productDAO.deleteProduct(deleteId);
                        System.out.println("Product deleted successfully!");
                    } catch (SQLException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }

        } while (choice != 0);
        scanner.close();
    }
}
