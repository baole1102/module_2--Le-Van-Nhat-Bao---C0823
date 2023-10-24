package ss11_java_collection.exc.arrlist.service;

import ss11_java_collection.exc.arrlist.repository.IProductRepository;
import ss11_java_collection.exc.arrlist.repository.ProductManager;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductManager();

    @Override
    public void showList() {
        iProductRepository.showList();
    }

    @Override
    public void add() {
        iProductRepository.add();
    }

    @Override
    public void deleteProduct() {
        iProductRepository.deleteProduct();
    }

    @Override
    public void searchProduct() {
        iProductRepository.searchProduct();
    }

    @Override
    public void editProduct() {
        iProductRepository.editProduct();
    }

    @Override
    public void ArrangeToUpper() {
        iProductRepository.ArrangeToUpper();
    }

    @Override
    public void ArrangToLower() {
        iProductRepository.ArrangToLower();
    }

    @Override
    public void Arrange() {
        iProductRepository.Arrange();
    }


}