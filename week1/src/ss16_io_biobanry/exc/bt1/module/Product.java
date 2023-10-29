package ss16_io_biobanry.exc.bt1.module;

public class Product {
    private int id;
    private String name;
    private double price;
    private String address;
    private String description;

    public Product() {
    }

    public Product(String name, double price, String address, String description) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.description = description;
    }

    public Product(int id, String name, double price, String address, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
