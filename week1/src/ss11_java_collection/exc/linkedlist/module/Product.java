package ss11_java_collection.exc.linkedlist.module;

public class Product {
    private String nameProduct;
    private Integer code;
    private Long price;

    public Product() {
    }

    public Product(String nameProduct, Long price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public Product(String nameProduct, Integer code, Long price) {
        this.nameProduct = nameProduct;
        this.code = code;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm: id: " + code + ", tên: " + nameProduct + ", giá: " + price;
    }

}
