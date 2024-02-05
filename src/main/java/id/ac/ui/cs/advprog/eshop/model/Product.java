package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private int productId;
    private String productName;
    private int productQuantity;
    public int getId() {
        return productId;
    }

    public void setId(int id) {
        this.productId = id;
    }

}