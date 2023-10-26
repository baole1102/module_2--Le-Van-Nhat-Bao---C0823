//package ss11_java_collection.exc.arrlist.service;
//
//import src.models.Product;
//import ss11_java_collection.exc.arrlist.repository.IProductRepository;
//import ss11_java_collection.exc.arrlist.repository.ProductManager;
//
//public class ProductService implements IProductService {
//    private IProductRepository iProductRepository = new ProductManager();
//
//    @Override
//    public void showList() {
//        iProductRepository.showList();
//    }
//
//    @Override
//    public void addProduct(Product product) {
//        iProductRepository.addProduct(product);
//    }
//
//    @Override
//    public void deleteProduct() {
//        iProductRepository.deleteProduct();
//    }
//
//    @Override
//    public void searchProduct() {
//        iProductRepository.searchProduct();
//    }
//
//    @Override
//    public void editProduct() {
//        iProductRepository.editProduct();
//    }
//
//    @Override
//    public void arrangeToUpper() {
//        iProductRepository.arrangeToUpper();
//    }
//
//    @Override
//    public void arrangeToLower() {
//        iProductRepository.arrangeToLower();
//    }
//
//    @Override
//    public void arrangeProduct() {
//        iProductRepository.arrangeProduct();
//    }
//
//
//}