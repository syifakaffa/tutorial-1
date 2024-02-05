package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    private int nextId = 1; //menyimpan ID product berikutnya (unik)

    public Product create(Product product) {
        product.setId(nextId); // set ID berdasarkan urutan masuk
        productData.add(product);
        nextId++;
        System.out.println(nextId + " " + product.getId());
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public boolean deleteById(int productId) {
        for (Product product : productData) {
            if (Objects.equals(product.getId(), productId)) {
                productData.remove(product);
                return true; // Produk berhasil dihapus
            }
        }
        return false; // Produk tidak ditemukan
    }
}