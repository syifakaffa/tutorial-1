package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public void delete(Product product) {
        productData.remove(product);
    }

    public List<Product> getProductData() {
        return productData;
    }

    public Product edit(Product editedProduct) {
        for (Product product : productData) {
            if (product.getId().equals(editedProduct.getId())) {
                product.setProductName(editedProduct.getProductName());
                product.setQuantity(editedProduct.getQuantity());
                return product;
            }
        }
        return null;
    }
}