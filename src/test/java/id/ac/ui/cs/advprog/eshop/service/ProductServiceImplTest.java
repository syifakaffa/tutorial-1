package id.ac.ui.cs.advprog.eshop.service;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplementTest {
    @InjectMocks
    ProductRepository productRepository;
    private ProductService service;

    @BeforeEach
    void setUp() {
        service = new ProductServiceImpl();
    }

    @Test
    void testDeleteProduct() {
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(100);
        service.create(product1);

        service.delete(product1.getProductId());

        // Periksa apakah produk telah dihapus
        Product deletedProduct = service.findProductById(product1.getProductId());
        assertNull(deletedProduct);
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();
        product.setProductName("Shampoo");
        product.setProductQuantity(10);

        Product createdProduct = service.create(product);

        // Melakukan pengecekan apakah produk berhasil dibuat dengan benar
        assertNotNull(createdProduct);
        assertNotNull(createdProduct.getProductId());
        assertEquals("Shampoo", createdProduct.getProductName());
        assertEquals(10, createdProduct.getProductQuantity());
    }

    @Test
    void testFindProductById() {
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(100);
        Product createProduct1 = service.create(product1);

        Product foundProduct = service.findProductById(product1.getProductId());

        assertNotNull(foundProduct);
        assertEquals(product1.getProductId(), foundProduct.getProductId());

        foundProduct = service.findProductById("non-existent-id");
        assertNull(foundProduct);
    }

    @Test
    void testEditProduct() {
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(100);
        service.create(product1);

        Product product2 = new Product();
        product2.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6"); // ID yang sama dengan product1
        product2.setProductName("Sampo Cap Usep");
        product2.setProductQuantity(50);

        service.edit(product2);

        Product edited = service.findProductById(product1.getProductId());

        // Verifikasi bahwa produk telah diubah dengan benar
        assertNotEquals(product2.getProductName(), edited.getProductName());
        assertNotEquals(product2.getProductQuantity(), edited.getProductQuantity());
        assertNotEquals(product2.getProductId(), edited.getProductId());

        // Verifikasi bahwa data produk yang disimpan telah diperbarui
        assertNotEquals(product2.getProductId(), product1.getProductId());
        assertNotEquals(product2.getProductQuantity(), product1.getProductQuantity());
    }

    @Test
    void testFindAllIfEmpty() {
        List<Product> productList = service.findAll();
        assertNotNull(productList);
        assertTrue(productList.isEmpty());
    }

    @Test
    void testFindAllIfMoreThanOneProduct() {
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(100);
        service.create(product1);

        Product product2 = new Product();
        product2.setProductId("a0f9de46-90b1-437d-a0bf-d0821dde9096");
        product2.setProductName("Sampo Cap Usep");
        product2.setProductQuantity(50);
        service.create(product2);

        List<Product> productList = service.findAll();

        assertNotNull(productList);
        assertFalse(productList.isEmpty());

        assertTrue(productList.contains(product1));
        assertTrue(productList.contains(product2));
    }

}