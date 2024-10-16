public class Product {
    private int id;
    private String name;
    private int categoryId;
    private int supplierId;
    private int quantity;
    private double price;

    // Constructor
    public Product(String name, int categoryId, int supplierId, int quantity, double price) {
        this.name = name;
        this.categoryId = categoryId;
        this.supplierId = supplierId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public int getSupplierId() { return supplierId; }
    public void setSupplierId(int supplierId) { this.supplierId = supplierId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
