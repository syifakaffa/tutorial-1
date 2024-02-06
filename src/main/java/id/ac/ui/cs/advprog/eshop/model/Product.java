package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private String productId;
    private String productName;
    private int productQuantity;

    public String getId() {
        return productId;
    }

    public void setId(String id) {
        this.productId = id;
    }

}