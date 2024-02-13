package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public Product create(Product product) {
        String id = UUID.randomUUID().toString();
        product.setProductId(id);
        productRepository.create(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        Iterator<Product> productIterator = productRepository.findAll();
        List<Product> allProduct = new ArrayList<>();
        productIterator.forEachRemaining(allProduct::add);
        return allProduct;
    }

    @Override
    public void delete(String productId) {
        Product product = findProductById(productId);
        productRepository.delete(product);
    }

    @Override
    public Product findProductById(String Id) {
        List<Product> productData = productRepository.getProductData();
        for (Product product : productData) {
            if (product.getProductId().equals(Id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void edit(Product product) {
        productRepository.edit(product);
    }
}